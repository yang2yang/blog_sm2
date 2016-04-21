package main.java.cn.qingtianr.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import main.java.cn.qingtianr.action.UserAction;

import java.util.Map;

/**
 * Created by jack on 16-4-21.
 */
public class checklogin extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        if(UserAction.class == actionInvocation.getAction().getClass()){
            return actionInvocation.invoke();
        }

        Map map = actionInvocation.getInvocationContext().getSession();
        if(null == map.get("username")){
            return Action.LOGIN;
        }
        return actionInvocation.invoke();
    }
}
