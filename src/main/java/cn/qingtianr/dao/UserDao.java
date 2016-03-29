package main.java.cn.qingtianr.dao;

import main.java.cn.qingtianr.model.User;

/**
 * Created by jack on 16-3-29.
 */
public interface UserDao {
    public User findByUserName(String username) throws Exception;
}
