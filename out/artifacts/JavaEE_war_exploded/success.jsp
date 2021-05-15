<%--
  Created by IntelliJ IDEA.
  User: faro_z
  Date: 2021/5/14
  Time: 下午3:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery-1.11.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/all.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css"/>
    <link rel="stylesheet" type="text/css" href="css/all.css"/>
    <title>登录成功</title>
    <style>
        .header-style {
            text-align: center;
            color: #3e8f3e;
        }
        .cust-size {
            font-size: 30px;
            line-height: 50px;
            height: 50px;
        }
    </style>
</head>
<body>
    <h1 class="header-style">登录成功</h1>

    <div class="container">
        <p class="text-primary text-center cust-size">欢迎，${sessionScope.get("user").name}</p>
        <a href="logout" class="btn btn-danger">点击，清空登录信息，并跳转到登录页面</a>
    </div>
</body>
</html>
