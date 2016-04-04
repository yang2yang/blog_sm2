<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 16-4-4
  Time: 下午3:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一个文章的修改界面</title>
</head>
<s:form action="updateonearticleaction">
    <s:textfield  label="标题" name="article.title" />
    <s:textfield label="类别"  name="article.archive" />
    <s:textarea label="内容" name="article.content" cols="20" rows="3"/>
    <s:submit   value="修改"/>
</s:form>
<s:debug/>
</body>
</html>
