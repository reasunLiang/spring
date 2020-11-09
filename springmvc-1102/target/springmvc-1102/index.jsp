<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<h2>Hello World!</h2>

<a href="anno/testRequestParam?name=不是吧">testRequestParam</a>

<form method="post" action="anno/testRequestBody">
    username:<input type="text" name="username"/><br/>
    age:<input type="text" name="age"/><br/>
    <input type="submit" value="提交">
</form>

<a href="anno/testCookieValue">testCookieValue</a>

<form method="post" action="anno/testModelAttribute">
    uname:<input type="text" name="uname"/><br/>
    age:<input type="text" name="age"/><br/>
    <input type="submit" value="提交">
</form>

<a href="anno/testSessionAttributes">testSessionAttributes</a>
<a href="anno/getSessionAttributes">getSessionAttributes</a>
<a href="anno/delSessionAttributes">delSessionAttributes</a>


</body>
</html>
