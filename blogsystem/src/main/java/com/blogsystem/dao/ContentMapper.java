package com.blogsystem.dao;

import com.blogsystem.entity.Content;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/28 23:17
 */
@Repository("/contentMapper")
//@Mapper
public interface ContentMapper {
    /**
     * 查询所有文章
     * @return
     */
    List<Content> selectAll();

    /**
     * 浏览文章
     * @param cid
     * @return
     */
    Content selectContentById(Integer cid);

    /**
     * 更新浏览量
     * @param cid
     * @return
     */
    int updateHitsById(Integer cid);

    /**
     * 查找最新文章
     * @return
     */
    List<Content> recentContent();
}
