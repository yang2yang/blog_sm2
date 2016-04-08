<%@ taglib prefix="s" uri="/struts-tags" %>
<%--<%@ taglib uri='http://ur6lad.co.ua/markdown-taglib' prefix ='md' %>--%>
<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 16-3-30
  Time: 下午3:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示所有文章的界面</title>
</head>
<body>
<p>下面是所有的文章</p>
<%--<s:iterator value="{'中华人民共和国', '美利坚合众国', '阿拉伯联合酋长国'}" var="cur">--%>
    <%--&lt;%&ndash;<s:property value="#st.count"/>&ndash;%&gt;--%>
    <%--<s:property value="cur"/><br/>--%>
<%--</s:iterator>--%>
<%--&lt;%&ndash;这里还是需要写一下s标签库中的语句&ndash;%&gt;--%>
<%--<s:iterator value="{'1','2','3'}" var="name">--%>
    <%--<s:property value="#name"/><br/>--%>
<%--</s:iterator>--%>

<s:iterator value="articlelist" var="name">
    <%--通过这个url来传递http的参数--%>
    <s:url action="getarticleaction" namespace="/" id="getArticleId">
        <s:param name="title" value="#name.title"></s:param>
    </s:url>
    <s:a href="%{getArticleId}"><s:property value="#name.title"/></s:a><br/>
    <s:property value="#name.archive"/><br/>
    <s:property value="#name.content"/><br/>
    <%-- 这里通过Markdown渲染一下--%>
    <%--<md:render text="Markdown _is_ __cool__!"/>--%>
</s:iterator>
<p>a:<s:property value="count"/></p>
----------------------------------------------------<br/>
<s:iterator value="archivecountlist" var="name">
    <s:property value="#name.archive" />:<s:property value="#name.count"/>
</s:iterator>
</body>
</html>
