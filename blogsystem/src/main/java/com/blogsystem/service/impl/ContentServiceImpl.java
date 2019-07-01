package com.blogsystem.service.impl;

import com.blogsystem.dao.ContentMapper;
import com.blogsystem.entity.Content;
import com.blogsystem.entity.RestResult;
import com.blogsystem.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/28 23:15
 */
@Service("/contentService")
public class ContentServiceImpl implements IContentService {
    @Autowired
    private ContentMapper contentMapper;
    @Override
    public List<Content> getContents(){
        List<Content> contents = contentMapper.selectAll();
        return contents;
    }
    @Override
    public Content selectContentById(Integer cid){
        Content content = contentMapper.selectContentById(cid);
        contentMapper.updateHitsById(cid);
        return content;
    }
    @Override
    public List<Content> getRecentContent(){
        return contentMapper.recentContent();
    }

}
