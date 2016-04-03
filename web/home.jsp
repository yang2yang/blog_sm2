<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 16-3-23
  Time: 下午4:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>blog_struts2</title>
  </head>
  <body>
  <p><s:a href="home.jsp">主页</s:a></p>
  <p><s:a href="login.jsp">登录</s:a></p>
  <p>文章列表:</p>
  <s:action name="articleactionshow" namespace="/" executeResult="true"/>
  <s:debug/>
  </body>
</html>
