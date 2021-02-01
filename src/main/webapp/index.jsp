<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/1/2021
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <h1>Menu</h1>
   <ul>

        <c:forEach var="student" items='${requestScope["list"]}'>
            <li><a href="${pageContext.request.contextPath}/student?id=${student.id}">${student.name}</a></li>
        </c:forEach>


   </ul>
</div>
</body>
</html>
