<%--
  Created by IntelliJ IDEA.
  User: Operator
  Date: 2017/12/28
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittles</title>
    </head>
    <body>
        <jsp:useBean id="spittleBeanList" scope="request" type="java.util.List"/>
        <c:forEach items="${spittleBeanList}" var="spittleBean">
            <li id="spittle_<c:out value="spittleBean.id"/>">
                <div class="spittleMessage">
                    <c:out value="${spittleBean.msg}"/>
                </div>
                <div>
                    <span class="spittleTime">
                        <c:out value="${spittleBean.time}"/>
                    </span>
                    <span class="spittleLocation">
                        (<c:out value="${spittleBean.latitude}"/>,
                        <c:out value="${spittleBean.longitude}"/>)
                    </span>
                </div>
            </li>
        </c:forEach>
    </body>
</html>
