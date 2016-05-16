package cn.qingtianr.blog.interceptor;

import java.util.Map;

import cn.qingtianr.blog.action.UserAction;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by jack on 16-4-21.
 */
public class checklogin extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
//      当访问的是login的action时，就直接调用这个action,利用的反射的知识
//      所以这里要注意的是actionInvocation这个参数是可以或者Action的实例的，也就是说所有的action的东西都可以办到。
        if(UserAction.class == actionInvocation.getAction().getClass()){
            return actionInvocation.invoke();
        }

//      先获得Session,那么Session一定是一个Map吗？感觉应该是。
        Map map = actionInvocation.getInvocationContext().getSession();
//      如果Session中的username属性没有值的话，那么就返回到login的视图，如果有值，就继续调用下面的Action。
        if(null == map.get("username")){
//          因为是判断是否登录的拦截器，所以这个视图必须要在struts.xml中使用全局的result定义。
            return Action.LOGIN;
        }
        return actionInvocation.invoke();
    }
}
