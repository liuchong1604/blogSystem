package com.blogsystem.service;

import com.blogsystem.entity.Content;
import com.blogsystem.entity.RestResult;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/28 23:15
 */
public interface IContentService {
    List<Content> getContents();
    Content selectContentById(Integer cid);
    List<Content> getRecentContent();
}
