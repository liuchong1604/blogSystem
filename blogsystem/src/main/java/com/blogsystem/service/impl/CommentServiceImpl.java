package com.blogsystem.service.impl;

import com.blogsystem.dao.CommentMapper;
import com.blogsystem.entity.Comment;
import com.blogsystem.service.ICommentService;
import com.blogsystem.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/30 14:36
 */
@Service("commentService")
public class CommentServiceImpl implements ICommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<Comment> selectAllComments() {
        List<Comment> comments=commentMapper.selectAllComments();
        if(comments!=null){
            return comments;
        }
        return null;
    }
    @Override
    public List<Comment> getRecentComment(){
        List<Comment> recentComment = commentMapper.recentComment();
        if(recentComment!=null){
            return recentComment;
        }
        return null;
    }
}
