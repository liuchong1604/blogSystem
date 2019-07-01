package com.blogsystem.service;

import com.blogsystem.entity.RestResult;
import com.blogsystem.entity.User;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/26 20:10
 */
public interface IUserService {
    RestResult login(String username, String password);
}
