<%--
  Created by IntelliJ IDEA.
  User: faro_z
  Date: 2021/5/15
  Time: 下午1:20
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
    <title>注册界面</title>
    <style>
        .input-div {
            margin-top: 40px;
            height: 100px;
            display: flex;
            flex-direction: row;
            align-items: center;
            text-align: center;
            border-radius: 5px;
            background-color: #2aabd2;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="input-div">
            请输入姓名：<input type="text" id="userName"> <span id="msg" style="color: red"></span>
        </div>
    </div>
</body>

<script>
    $(function () {
        $("#userName").blur(function () {
            var name = $("#userName").val();
            $.ajax({
                url: "/register-check",
                data: "userName="+name,
                type: "post",
                dataType: "text", //指定回调函数的返回类型
                success: function (rs) { //回调函数
                    console.log(rs);
                    $("#msg").html(rs)
                }
            });
        });
    });
</script>

</html>
