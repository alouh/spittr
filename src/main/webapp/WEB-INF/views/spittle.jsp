<%--
  Created by IntelliJ IDEA.
  User: Operator
  Date: 2017/12/28
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittle</title>
    </head>
    <body >
        <div class="spittleId">
            <c:out value="${spittleBean.id}"/>
        </div>
        <div class="spittleMsg">
            <c:out value="${spittleBean.msg}"/>
        </div>
        <div class="spittleTime">
            <c:out value="${spittleBean.time}"/>
        </div>
    </body>
</html>
