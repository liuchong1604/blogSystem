package com.blogsystem.dao;

import com.blogsystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/26 20:30
 */
@Repository("userMapper")
//@Mapper
public interface UserMapper {
    /**
     * 查询用户是否存在
     * @param username
     * @param password
     * @return
     */
    //@Select("select * from t_users where username=#{username} and password=#{password}")
    List<User> selectUserByNameAndPassword(String username,String password);
}
