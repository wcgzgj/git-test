<%--
  Created by IntelliJ IDEA.
  User: faro_z
  Date: 2021/5/15
  Time: 下午5:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="js/jquery-1.11.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
    <%--<script src="js/all.js" type="text/javascript" charset="utf-8"></script>--%>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css"/>
    <link rel="stylesheet" type="text/css" href="css/all.css"/>
    <title>上传的文件展示</title>
</head>
<body>

    <div class="container">
        <h1 class="font">文件展示</h1>
        <a href="download?filename=${filename}" class="btn btn-primary">点击下载图片</a>

        <img src="uploadfile/${filename}" alt="上传的图片">

    </div>


</body>
</html>
