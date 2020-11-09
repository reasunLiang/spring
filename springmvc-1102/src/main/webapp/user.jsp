<%--
  Created by IntelliJ IDEA.
  User: lyx
  Date: 2020/11/5
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="user/saveUser">
    用户名:<input name="uname" type="text"/><br/>
    年龄:<input name="age" type="text"/><br/>
    生日:<input name="date" type="text"/><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
