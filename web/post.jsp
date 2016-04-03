<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 16-4-3
  Time: 下午3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>每一篇文章的内容</title>
</head>
<body>
<s:iterator value="article" var="name">
    <s:property value="#name.title" />
    <s:property value="#name.archive" />
    <s:property value="#name.content" />
</s:iterator>
<s:debug/>
</body>
</html>
