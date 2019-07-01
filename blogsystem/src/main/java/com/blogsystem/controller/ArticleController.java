package com.blogsystem.controller;

import com.blogsystem.entity.Content;
import com.blogsystem.entity.RestResult;
import com.blogsystem.service.IContentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/28 23:13
 */
@RestController
@RequestMapping("/admin/article")
public class ArticleController {
    @Autowired
    private IContentService contentService;
    @RequestMapping(value="",method = RequestMethod.GET)
    public RestResult index(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                            @RequestParam(value = "limit", defaultValue = "2") int limit, HttpServletRequest request){
        PageHelper.startPage(pageNum,limit);
        List<Content> contents = contentService.getContents();
        PageInfo<Content> pageInfo = new PageInfo<>(contents);
        Map<String,Object> map = new HashMap<>();
        map.put("contents",contents);
        map.put("pageTotal",pageInfo.getPages());
        return new RestResult(RestResult.SUCCESS,"查询成功",map);
    }
    @RequestMapping(value="/selectContentById",method = RequestMethod.GET)
    public RestResult selectContentById(@RequestParam(value = "cid", defaultValue = "1")Integer cid){
        Content content = contentService.selectContentById(cid);
        //System.out.println(content.getCid());
        return new RestResult(RestResult.SUCCESS,"成功",content);
    }
    
}
