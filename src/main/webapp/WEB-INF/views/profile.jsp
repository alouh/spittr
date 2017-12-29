<%--
  Created by IntelliJ IDEA.
  User: Operator
  Date: 2017/12/29
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<html>
    <head>
        <title>Profile</title>
    </head>
    <body>
        <h1>Your Profile</h1>

        First Name:<c:out value="${spitterBean.firstName}"/><br>
        Last Name:<c:out value="${spitterBean.lastName}"/><br>
        User Name:<c:out value="${spitterBean.userName}"/><br>
    </body>
</html>
