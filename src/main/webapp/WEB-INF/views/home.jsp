<%--
  Created by IntelliJ IDEA.
  User: Operator
  Date: 2017/12/28
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittr</title>
        <link rel="stylesheet"
              type="text/css"
              href="<c:url value="/resources/style.css"/> ">
    </head>
    <body >
        <h1>Welcome to Spittr</h1>

        <a href="<c:url value="/spittles"/> ">Spittles</a> |
        <a href="<c:url value="/spitter/register"/> ">Register</a>
    </body>
</html>
