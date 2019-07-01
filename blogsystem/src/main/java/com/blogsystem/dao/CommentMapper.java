package com.blogsystem.dao;

import com.blogsystem.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/30 14:34
 */
@Repository("commentMapper")
public interface CommentMapper {
    /**
     * 查找所有评论
     * @return
     */
    List<Comment> selectAllComments();
    List<Comment> recentComment();
}
