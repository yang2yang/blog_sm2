package main.java.cn.qingtianr.factory;

import main.java.cn.qingtianr.service.UserService;
import main.java.cn.qingtianr.service.impl.UserServiceImpl;

/**
 * Created by jack on 16-3-29.
 */
public class ServiceFactory {
    public static UserService getUserServiceInstance()
    {
        return new UserServiceImpl();
    }
}
