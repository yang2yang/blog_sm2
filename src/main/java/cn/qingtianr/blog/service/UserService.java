package cn.qingtianr.blog.service;

import cn.qingtianr.blog.model.User;

/**
 * Created by jack on 16-3-29.
 */
public interface UserService {
    public User findByUserName(String username) throws Exception;
}
