package main.java.cn.qingtianr.service;

import main.java.cn.qingtianr.model.User;

/**
 * Created by jack on 16-3-29.
 */
public interface UserService {
    public User findByUserName(String username) throws Exception;
}
