<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/1/2021
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Ten: ${requestScope["student"].name}</h2>
<h2>Tuoi: ${requestScope["student"].age}</h2>
<h4>${requestScope["student"].status}</h4>
</body>
</html>
