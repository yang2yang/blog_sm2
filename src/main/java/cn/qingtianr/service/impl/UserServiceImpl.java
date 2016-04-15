package main.java.cn.qingtianr.service.impl;

import main.java.cn.qingtianr.dao.UserDao;
import main.java.cn.qingtianr.dbc.MybatisSqlSessionFactory;
import main.java.cn.qingtianr.model.User;
import main.java.cn.qingtianr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jack on 16-3-29.
 */
public class UserServiceImpl implements UserService{

    private UserDao userdao;

    public User findByUserName(String username) throws Exception
    {
        User user = null;
        try
        {
            if(userdao == null){
                System.out.println("11111111111");
            }
            user = this.userdao.findByUserName(username);
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

    public UserDao getUserdao() {
        System.out.println("It is in getUserdao");
        return userdao;
    }


    public void setUserdao(UserDao userdao) {
        System.out.println("It is in setUserdao");
        this.userdao = userdao;
    }
}
