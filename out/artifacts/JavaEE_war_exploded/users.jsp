<%--
  Created by IntelliJ IDEA.
  User: faro_z
  Date: 2021/5/15
  Time: 下午2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <script src="js/jquery-1.11.1.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/all.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css"/>
    <link rel="stylesheet" type="text/css" href="css/all.css"/>
    <title>展示所有用户</title>
</head>
<body>
    <div class="container">
        <button class="btn btn-primary" id="queryAll">查询所有用户数据</button>

    </div>
</body>

<script>
    $(function () {
        $("#queryAll").click(function () {
            $.ajax({
                url: "/all",
                type: "post",
                dataType: "json",
                success: function (res) {
                    if (res.success) {
                        var list = res.content;
                        for (let i = 0; i < list.length; i++) {
                            console.log(list[i].name);
                        }
                    }
                }
            })
        })
    });


</script>
</html>
