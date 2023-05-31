<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <title>Person Information</title>
</head>
<body>
<div style="padding:20px;">人员信息：</div>
<div style="padding-left:40px;">
  <c:if test="${person != null}">
    <table border="1">
      <tr>
        <td>编号:</td>
        <td>姓名:</td>
        <td>年龄:</td>
        <td>操作</td>
      </tr>
    <tr>
      <td>${person.id}</td>
      <td>${person.name}</td>
      <td>${person.age}</td>
      <td>
        <a href=/person/update?id=${person.id}>修改</a>
        <a href=/person/deleteById?id=${person.id}>删除</a>
      </td>
    </tr>
  </c:if>
  <c:if test="${person == null}">
    <div>查询内容不存在！</div>
  </c:if>
  <div style="padding-top:20px;">
    <a href="/person/all">返回</a>
  </div>
</div>
</body>
</html>


