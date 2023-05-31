<%--
  Created by IntelliJ IDEA.
  User: shikangwei
  Date: 2023/3/21
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <title>Find Person</title>
</head>
<body>
<form action="/person/find" method="post">
  <div style="padding:20px;">查找人员</div>
  <div style="padding-left:40px;">
    <input type="text" name="id" placeholder="请输入要查找的人员ID">
    <input type="submit" value="查找">
  </div>
</form>
</body>
</html>

