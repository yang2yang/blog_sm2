<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 16-4-4
  Time: 下午2:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章管理页面</title>
</head>
<br>
<s:iterator value="articlelist" var="name">
    <%--通过这个url来传递http的参数--%>
    <s:url action="updatearticleaction" namespace="/" id="updateArticleId">
        <s:param name="title" value="#name.title"></s:param>
    </s:url>
    <s:url action="deletearticleaction" namespace="/" id="deleteArticleId">
        <s:param name="title" value="#name.title"></s:param>
    </s:url>
    <s:property value="#name.title"/>
    <s:a href="%{updateArticleId}">修改</s:a>
    <s:a href="%{deleteArticleId}">删除</s:a><br/>
</s:iterator>
</body>
</html>
