<%--
  Created by IntelliJ IDEA.
  User: lyx
  Date: 2020/11/5
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>acount</title>
</head>
<body>
<%--
<form action="account/testParam" method="post">
    用户名<label>
    <input name="username" type="text"/>
</label><br/>
    密码<label>
    <input name="password" type="text"/>
</label><br/>
    经济<label>
    <input name="account" type="text"/>
</label><br/>
    用户名称<label>
    <input name="user.uname" type="text"/>
</label><br/>
    用户年龄<label>
    <input name="user.age" type="text"/>
</label><br/>
    <input type="submit" value="提交"/>
</form>--%>

<form method="post" action="/account/testParam">
    用户名<input name="username" type="text"/><br/>
    密码<input name="password" type="text"/><br/>
    金额<input name="account" type="text"/><br/>

    用户名字<input name="list[0].uname" type="text"/><br/>
    用户用户年龄<input name="list[0].age" type="text"/><br/>

    用户名字<input name="map['key'].uname" type="text"/><br/>
    用户年龄<input name="map['key'].age" type="text"/><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
