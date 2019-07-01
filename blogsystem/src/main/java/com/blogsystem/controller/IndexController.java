package com.blogsystem.controller;

import com.blogsystem.entity.Comment;
import com.blogsystem.entity.Content;
import com.blogsystem.entity.RestResult;
import com.blogsystem.service.ICommentService;
import com.blogsystem.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/7/1 8:20
 */
@RestController
@RequestMapping("/admin")
public class IndexController {
    @Autowired
    private ICommentService commentService;
    @Autowired
    private IContentService contentService;
    @RequestMapping(value = {"","/index"},method = RequestMethod.GET)
    public RestResult index(HttpServletRequest request){
        List<Content> recentContents = contentService.getRecentContent();
        List<Comment> recentComments = commentService.getRecentComment();
        Map<String,Object> map = new HashMap<>();
        map.put("recentContents",recentContents);
        map.put("recentComments",recentComments);
        return new RestResult(RestResult.SUCCESS,"成功",map);
    }

}
