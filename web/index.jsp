<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: thais
  Date: 22/12/2019
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web App Tutorial Java</title>
  </head>
  <body>
  <h1>Hello Word</h1>
  <p>dsadsadadadadad JSP page</p>

  <%
  Date now = new Date();
  out.print("<h2>"+ now.toString() + "</h2>");
  %>
  </body>
</html>
