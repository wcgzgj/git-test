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
    <title>上传</title>
</head>
<body>
<div class="container">

    <h1 class="font">文件上传界面</h1>

    <form action="/upload" method="post" role="form" enctype="multipart/form-data" class="form-horizontal form-class">

        <div class="form-group">
            <label class="control-label col-sm-4">选择文件:</label>
            <input type="file" name="file" class="col-sm-8">
        </div>


        <button type="submit" class="btn btn-primary">上传</button>
    </form>
</div>
</body>
</html>
