<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Spitter</title>
        <link rel="stylesheet" type="text/css"
              href="<c:url value="/resources/style.css"/> ">
    </head>
    <body>
        <h1>Register</h1>

        <form method="post">
            First Name :<input type="text" name="firstName"/><br>
            Last Name :<input type="text" name="lastName"/><br>
            User Name :<input type="text" name="userName"/><br>
            Password :<input type="password" name="password"/><br>
            <input type="submit" value="Register"/>
        </form>
    </body>
</html>