package cn.qingtianr.blog.service.impl;

import cn.qingtianr.blog.dao.UserDao;
import cn.qingtianr.blog.model.User;
import cn.qingtianr.blog.service.UserService;

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
