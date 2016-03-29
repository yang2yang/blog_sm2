package main.java.cn.qingtianr.action;

import com.opensymphony.xwork2.ActionSupport;
import main.java.cn.qingtianr.factory.ServiceFactory;
import main.java.cn.qingtianr.model.User;

/**
 * Created by jack on 16-3-25.
 */
public class UserAction extends ActionSupport {
    private String username;
    private String password;

    public String execute() throws Exception{
        //如果验证成功，则返回success,否则失败返回fail
//        System.out.println(username);
//        return "success";
        User user = ServiceFactory.getUserServiceInstance().findByUserName(username);
//        System.out.println("password="+password+'\n'+"password="+user.getPassword());
        if (user != null && user.getPassword().equals(password))
        {
            return "success";
        }
        else
        {
            return "fail";
        }
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
