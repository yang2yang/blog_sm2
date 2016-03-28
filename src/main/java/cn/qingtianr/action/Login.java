package main.java.cn.qingtianr.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by jack on 16-3-25.
 */
public class Login extends ActionSupport {
    private String username;
    private String password;

    public String execute() throws Exception{
        //如果验证成功，则返回success,否则失败返回fail
        return "success";
//        if ()
//        {
//            return "success";
//        }
//        else
//        {
//            return "fail";
//        }
    }

}
