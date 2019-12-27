<%--
  Created by IntelliJ IDEA.
  User: thais
  Date: 22/12/2019
  Time: 9:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>This is the login</h1>
    <form action="/login" method="post">
        login-name: <input type="text" name="loginName" width="30"/>
        password: <input type="password" name="password" width="10"/>
        <input type="submit" value="Login"/>
    </form>
    <p style="color:red">${errorMessage}</p>

</body>
</html>
