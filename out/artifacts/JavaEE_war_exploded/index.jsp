<%--
  Created by IntelliJ IDEA.
  User: faro_z
  Date: 2021/5/13
  Time: 下午3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <h1>这里是首页</h1>

    <a href="hello?userAge=123&userName=faro_z">执行doGet</a>
    <hr/>
    <form action="hello" method="post">
        <input type="text" name="name">
        <input type="password" name="password">
        <button type="submit">执行post</button>
    </form>
</body>
</html>
