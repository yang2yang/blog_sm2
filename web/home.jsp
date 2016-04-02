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
  <p>主页</p>
  <p>登录</p>
  <p>文章列表:</p>
  <s:iterator value="articlelist" var="name">
    <s:property value="#name.title"/><br/>
    <s:property value="#name.archive"/><br/>
    <s:property value="#name.content"/><br/>
  </s:iterator>
  <s:debug/>
  </body>
</html>
