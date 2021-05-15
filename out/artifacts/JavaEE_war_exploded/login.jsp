<%--
  Created by IntelliJ IDEA.
  User: faro_z
  Date: 2021/5/14
  Time: 下午3:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <script src="js/jquery-1.11.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
    <%--<script src="js/all.js" type="text/javascript" charset="utf-8"></script>--%>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css"/>
    <link rel="stylesheet" type="text/css" href="css/all.css"/>
    <title>登录页面</title>
</head>
<body>
<div class="container">
    <h1 class="font">登录界面</h1>

    <form action="login" method="post" role="form" class="form-horizontal form-class">
        <div class="form-group">
            <label for="userName" class="col-sm-2 control-label" >用户名</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="userName" id="userName" placeholder="请输入用户名">
            </div>
            <span class="col-sm-2" id="userNameMsg">请输入</span>
        </div>

        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-8">
                <input type="text" name="password" id="password" class="form-control" placeholder="请输入密码"/>
            </div>
            <span class="col-sm-2" id="passwordMsg">请输入</span>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">提交</button>
            <button type="reset" class="btn btn-primary">重置</button>
        </div>
    </form>
</div>

</body>

<script>

    $(function () {
        /**
         * 一旦用户名输入框失去焦点
         * 就去后端查询用户的信息，然后根据返回值，在前端展示
         * 同时，如果查询到对应用户，就将用户密码一并返回
         * 并自动填充
         */
        $("#userName").blur(function () {
            var name = $("#userName").val();
            $.ajax({
                url: "/login-check",
                type: "post",
                data: "name="+name,
                dataType: "json",
                success: function (res) {
                    //如果返回的数据报是成功信息
                    if (res.success) {
                        //在提示栏显示数据合法
                        $("#userNameMsg").css("color","green");
                        $("#userNameMsg").html("用户存在")

                        //自动填充密码
                        var password = res.content.password;
                        $("#password").val(password);
                        $("#passwordMsg").css("color","green");
                        $("#passwordMsg").html("自动填充")

                    } else { //如果数据报是失败信息
                        //在提示栏显示数据不合法
                        $("#userNameMsg").css("color","red");
                        $("#userNameMsg").html(res.message);

                        $("#password").val("")
                        $("#passwordMsg").css("color","red");
                        $("#passwordMsg").html("无填充")
                    }
                }
            })
        })
    })


</script>

</html>
