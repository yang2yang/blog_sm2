package main.java.cn.qingtianr.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import main.java.cn.qingtianr.dao.UserDao;
import main.java.cn.qingtianr.factory.ServiceFactory;
import main.java.cn.qingtianr.model.User;
import main.java.cn.qingtianr.service.UserService;

import java.util.Map;

/**
 * Created by jack on 16-3-25.
 */
public class UserAction extends ActionSupport {
    private String username;
    private String password;
//  创建get和set函数
    private UserService usersi;

    public String execute() throws Exception{
        //如果验证成功，则返回success,否则失败返回fail
//        System.out.println(username);
//        return "success";
//        获得相应的session的map
        Map map = ActionContext.getContext().getSession();

        User user = usersi.findByUserName(username);
//        System.out.println("password="+password+'\n'+"password="+user.getPassword());
        if (user != null && user.getPassword().equals(password))
        {
//            如果map中没有username这个filed，那么就将这个filed的key赋给username
            if(null == map.get("username")){
                map.put("username",username);
            }
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

    public UserService getUsersi() {
//        System.out.println("It is in getUsrsi!");
        return usersi;
    }

    public void setUsersi(UserService usersi) {
//        System.out.println("It is in setUsrsi!");
        this.usersi = usersi;
    }

}
