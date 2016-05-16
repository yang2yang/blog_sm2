package cn.qingtianr.blog.dao;

import cn.qingtianr.blog.model.User;

/**
 * Created by jack on 16-3-29.
 */
public interface UserDao {
    public User findByUserName(String username) throws Exception;
}
