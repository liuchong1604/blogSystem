package com.blogsystem.controller;

import com.blogsystem.entity.Comment;
import com.blogsystem.entity.Content;
import com.blogsystem.entity.RestResult;
import com.blogsystem.service.ICommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
 * @create 2019/6/30 14:29
 */
@RestController
@RequestMapping("/admin/comments")
public class CommentController {
    @Autowired
    private ICommentService commentService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public RestResult index(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                            @RequestParam(value = "limit", defaultValue = "2") int limit, HttpServletRequest request){
        System.out.println(pageNum);
        PageHelper.startPage(pageNum,limit);
        List<Comment> comments = commentService.selectAllComments();
        System.out.println(comments);
        PageInfo<Comment> pageInfo = new PageInfo<>(comments);
        Map<String,Object> map = new HashMap<>();
        map.put("comments",comments);
        map.put("pageTotal",pageInfo.getPages());
        return new RestResult(RestResult.SUCCESS,"查询成功",map);
    }

}
