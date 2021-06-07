<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/6/4
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/axios-0.18.0.js"></script>
</head>
<body>
<%--<a href="/requestHeader">点我</a>--%>
<form  action="/requestBody" method="post">
    <%--<hidden name="_method" value="put"/>--%>
    用户名:<input type="text" name="username"><br/>
    昵称:<input type="text" name="nickname"><br/>
    <input type="submit">
</form>

<input type="button"  value="点我发送ajax请求" onclick="sendMessage()"/>
<script>
    function sendMessage(){
        var json={"username":"小明","nickname":"哗哗"};

        axios.post("requestBody",json);

    }
</script>

<form action="/fileUplodad" method="post" enctype="multipart/form-data">
    <input type="file" name="file" value="点我上传文件">
    <input type="submit">
</form>
</body>
</html>
