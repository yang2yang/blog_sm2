package cn.qingtianr.blog.model;
import java.io.Serializable;

/**
 * Created by jack on 16-3-25.
 * 这个类是用户的vo类。
 */
public class User implements Serializable{
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
