<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../image/favicon.ico">

    <title>Blog Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <!-- <link href="////css/bootstrap.min.css" rel="stylesheet"> -->
	
	<link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/////css/bootstrap.min.css" rel="stylesheet">


    <!-- Custom styles for this template -->
    <link href="../../css/blog.css" rel="stylesheet">
    <link href="/css/bootstrap-markdown.min.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <div class="blog-masthead">
      <div class="container">
        <nav class="blog-nav">
          <a class="blog-nav-item active" href="#">Home</a>
          <a class="blog-nav-item" href="#">New features</a>
          <a class="blog-nav-item" href="#">Press</a>
          <a class="blog-nav-item" href="#">New hires</a>
          <a class="blog-nav-item" href="login">back</a>
        </nav>
      </div>
    </div>

    <div class="container">

      <div class="blog-header">
        <h1 class="blog-title">Blog</h1>
        <p class="lead blog-description">这是一个个人博客.</p>
      </div>

      <div class="row">

        <div class="col-sm-8 blog-main">
        <s:iterator value="articlelist" var="name">
          <%--通过这个url来传递http的参数--%>
          <s:url action="getOneaction" namespace="/" id="getArticleId">
            <s:param name="title" value="#name.title"></s:param>
          </s:url>
          <div class="blog-post">
            <h2 class="blog-post-title"><s:a href="%{getArticleId}"><s:property value="#name.title"/></s:a></h2>
            <p class="blog-post-meta"><s:property value="#name.datetime"/> created by <a href="#">yang2yang</a></p>
            <%--先暂时不使用分类这个选项--%>
          <%--<s:property value="#name.archive"/><br/>--%>
            <%--内容就是正常的字就可以了，然后点击的时候在跳转到post界面--%>
            <div  name="preview"> </div>
            <textarea id="text-input" name="myinput" hidden="hidden" oninput="this.editor.update()"
                      rows="6" cols="60"><s:property value="#name.content"/></textarea>
          <%--<div><s:property value="#name.content"/></div><br/>--%>
          <%-- 这里通过Markdown渲染一下--%>
          <%--<md:render text="Markdown _is_ __cool__!"/>--%>
            </div>
        </s:iterator>
          <nav>
            <ul class="pagination">
              <li>
                <a href="#" aria-label="Previous">
                  <span aria-hidden="true">&laquo;</span>
                </a>
              </li>
              <s:iterator value="numberlist" id="number">
                <li><a href="showaction?page=<s:property value='#number'/>"><s:property value='#number'/></a></li>
              </s:iterator>

              <%--<c:forEach var="i" begin="1" end="5">--%>
                <%--Item <c:out value="${i}"/><p>--%>
                <%--<li><a href="articleactionshow?page=${i}">${i}</a></li>--%>
              <%--</c:forEach>--%>
              <%--<li><a href="articleactionshow?page=1">1</a></li>--%>
              <%--<li><a href="articleactionshow?page=2">2</a></li>--%>
              <%--<li><a href="#">3</a></li>--%>
              <%--<li><a href="#">4</a></li>--%>
              <%--<li><a href="#">5</a></li>--%>
              <li>
                <a href="#" aria-label="Next">
                  <span aria-hidden="true">&raquo;</span>
                </a>
              </li>
            </ul>
          </nav>
          <%--<nav>--%>
            <%--<ul class="pager">--%>
              <%--<li><a href="#">Previous</a></li>--%>
              <%--<li><a href="#">Next</a></li>--%>
            <%--</ul>--%>
          <%--</nav>--%>
          </div>


        <div class="col-sm-3 col-sm-offset-1 blog-sidebar">
          <div class="sidebar-module sidebar-module-inset">
            <h4>About</h4>
            <p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>
          </div>
          <div class="sidebar-module">
            <h4>Archives</h4>
            <ol class="list-unstyled">
              <s:iterator value="articlecount" var="name">
                <li><a href="#"><s:property value="#name.datetime"/></a><span> (<s:property value="#name.count"></s:property>)</span></li>
              </s:iterator>

            </ol>
          </div>
          <div class="sidebar-module">
            <h4>Elsewhere</h4>
            <ol class="list-unstyled">
              <li><a href="#">GitHub</a></li>
              <li><a href="#">Twitter</a></li>
              <li><a href="#">Facebook</a></li>
            </ol>
          </div>
        </div><!-- /.blog-sidebar -->

      </div><!-- /.row -->

</div><!-- /.container -->


<footer class="blog-footer">
      <p>Blog template built for <a href="http://getbootstrap.com">Bootstrap</a> by <a href="https://twitter.com/mdo">@mdo</a>.</p>
      <p>
        <a href="#">Back to top</a>
      </p>
    </footer>


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script> -->
	<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
    <script src="/js/markdown.js"></script>

	<%--<script src="/js/bootstrap-markdown.js"></script>--%>
    <%--<script src="/js/to-markdown.js"></script>--%>
    <%--<script src="/js/markdown.js"></script>--%>
    <!-- <script src="/js/bootstrap.min.js"></script> -->
	<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="/js/ie10-viewport-bug-workaround.js"></script>
    <script>
      function Editor() {
        var input = document.getElementsByName("myinput");
        var preview = document.getElementsByName("preview");
        for(var i=0;i < input.length;i++) {
          console.log("aaa" + input[i].value)
          if (input[i]) {
//          input[i].value = input[i].value
            preview[i].innerHTML = markdown.toHTML(input[i].value);
//          document.getElementsByName("preview")[i].innerHTML = markdown.toHTML(document.getElementsByName("myinput").value);
          }
        }
//        else
//        {
//          console.log("123");
//        }
      }
      var $ = function (name) { return document.getElementsByName(name); };

//      new Editor($("myinput"), $("preview"));
      new Editor();
    </script>

  </body>
</html>
