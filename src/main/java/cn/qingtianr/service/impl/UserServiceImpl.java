package main.java.cn.qingtianr.service.impl;

import main.java.cn.qingtianr.dao.UserDao;
import main.java.cn.qingtianr.model.User;
import main.java.cn.qingtianr.service.UserService;

/**
 * Created by jack on 16-3-29.
 */
public class UserServiceImpl implements UserService{

    private UserDao userdao;

    public User findByUserName(String username) throws Exception
    {
        User user = null;
        user = this.userdao.findByUserName(username);
       return user;
    }

    public UserDao getUserdao() {
//        System.out.println("It is in getUserdao");
        return userdao;
    }


    public void setUserdao(UserDao userdao) {
//        System.out.println("It is in setUserdao");
        this.userdao = userdao;
    }
}
