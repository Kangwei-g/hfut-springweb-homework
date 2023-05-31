<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>PersonList</title>
</head>
<body>
    <form action="" method="post">

        <div style="padding:20px;">
                        人员列表
        </div>
        
        <div style="padding-left:40px;">
            <a href="/person/find">查找</a>
            <a href="/person/create">新增</a>   <!-- 跳转路径 -->
        </div>
        
         <table border="1">
            <tr>
                <td>编号:</td>
                <td>姓名:</td>
                <td>年龄:</td>
                <td>操作</td>
            </tr>

            <c:forEach items="${personList}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.age}</td>
                    <td>
                        <a href=/person/update?id=${p.id}>修改</a>
                        <a href=/person/deleteById?id=${p.id}>删除</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </form>

</body>
</html>