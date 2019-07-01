package com.blogsystem.controller;

import com.blogsystem.entity.RestResult;
import com.blogsystem.entity.User;
import com.blogsystem.service.IUserService;
import com.blogsystem.utils.BlogUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/26 19:25
 */
@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/login")
    public RestResult login(String username, String password, String verifycode, @RequestParam(value = "rember_me",required = false)String rember_me,HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        /*System.out.println(username);
        System.out.println(password);
        System.out.println(verifycode);*/
        if(verifycode.equalsIgnoreCase(session.getAttribute("code").toString())) {
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                session.setAttribute("user", user);
                if (StringUtils.isNotBlank(rember_me)) {
                    BlogUtils.setCookie(response, request.getSession());
                }
                return userService.login(username, password);
            }else {
                return new RestResult(RestResult.FAILED,"验证码错误");
            }
    }

    @RequestMapping("/logout")
    public RestResult logout(HttpSession session,HttpServletResponse response,HttpServletRequest request){
        session.removeAttribute("user");
        Cookie cookie=new Cookie("JSESSIONID","");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return new RestResult(RestResult.SUCCESS,"注销成功");
    }

}
