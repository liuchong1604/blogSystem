package com.blogsystem.service;

import com.blogsystem.entity.Comment;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/30 14:36
 */
public interface ICommentService {
    /**
     * 查询所有评论
     * @return
     */
    List<Comment> selectAllComments();

    /**
     * 获取最近评论
     * @return
     */
    List<Comment> getRecentComment();
}
