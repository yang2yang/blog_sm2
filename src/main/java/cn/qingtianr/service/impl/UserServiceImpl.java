package main.java.cn.qingtianr.service.impl;

import main.java.cn.qingtianr.dao.UserDao;
import main.java.cn.qingtianr.dbc.MybatisSqlSessionFactory;
import main.java.cn.qingtianr.model.User;
import main.java.cn.qingtianr.service.UserService;

/**
 * Created by jack on 16-3-29.
 */
public class UserServiceImpl implements UserService{
    public User findByUserName(String username) throws Exception
    {
        User user = null;
        try
        {
            user = MybatisSqlSessionFactory.getSession().getMapper(UserDao.class).findByUserName(username);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        finally
        {
            MybatisSqlSessionFactory.closeSession();
        }
        return user;
    }
}
