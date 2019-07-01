package com.blogsystem.service.impl;

import com.blogsystem.dao.UserMapper;
import com.blogsystem.entity.RestResult;
import com.blogsystem.entity.User;
import com.blogsystem.service.IUserService;
import com.blogsystem.utils.BlogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/26 20:11
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public RestResult login(String username, String password) {
        String pwd = BlogUtils.MD5encode(password);
        System.out.println(pwd);
        List<User> users = userMapper.selectUserByNameAndPassword(username,pwd);
        System.out.println(users);
        if(users.size()==0){
            return new RestResult(RestResult.FAILED,"用户名或密码错误");
        }else if(users.size()>1){
            return new RestResult(RestResult.FAILED,"数据库设计有误");
        }else{
            return new RestResult(RestResult.SUCCESS,"登录成功",users);
        }
    }
}
