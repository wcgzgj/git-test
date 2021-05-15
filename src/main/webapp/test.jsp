<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: faro_z
  Date: 2021/5/14
  Time: 下午2:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>测试JSTL</title>
</head>
<body>
    <%
        List<String> list = new ArrayList<>();
        list.add("haha");
        list.add("呵呵");
        list.add("嘻嘻");
        session.setAttribute("list",list);
    %>

    <c:forEach items="${sessionScope.list}" varStatus="status" var="item">
        ${status.index}---${status.count} : ${item} <br/>
    </c:forEach>

    <c:if test="${name=='张三'}">
        这是张三
    </c:if>

    <%
        session.setAttribute("date",new Date());
    %>

    <br/>
    date = <fmt:formatDate value="${sessionScope.date}" pattern="yyyy-MM-dd"></fmt:formatDate>



</body>
</html>
