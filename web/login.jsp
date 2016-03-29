<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 16-3-23
  Time: 下午5:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<%--<s:form action="login" method="POST">--%>
    <%--用户名：<input type="text" name="username">--%>
    <%--密码：<input type="text" name="password">--%>
    <%--<input type="submit" name="">--%>
    <%--</s:form>--%>
<s:form action="useraction" method="post">
    <s:textfield  label="姓名" name="username"  tooltip="Enter your Name here"  />
    <s:password label="密码"  name="password" />
    <s:textarea  label="备注" name="remark" cols="20" rows="3" tooltip="Enter your remark"/>
    <%--<s:hidden name="topic.ic" value="<s:property value='topic.id'/>"></s:hidden>--%>
    <s:submit   value="提交"/>
    <s:reset  value="重置" />
</s:form>
    </body>
</html>
