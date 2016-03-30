<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 16-3-30
  Time: 下午3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wirtearticle</title>
</head>
<body>
<s:form action="articleaction" method="post">
    <s:textfield  label="标题" name="title"  tooltip="Enter your article here"  />
    <s:textfield label="类别"  name="archive" />
    <s:textarea label="内容" name="content" cols="20" rows="3" tooltip="Enter your content"/>
    <s:submit   value="提交"/>
    <s:reset  value="重置" />
</s:form>
</body>
</html>
