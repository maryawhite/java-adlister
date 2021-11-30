<%--
  Created by IntelliJ IDEA.
  User: marywhite
  Date: 11/30/21
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <%-- the taglib directive for JSTL. the prefix is how we'll call it --%>

<% if(request.getMethod().equalsIgnoreCase("post")){
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username.equals("admin") && password.equals("password")){
        response.sendRedirect("/profile.jsp");
    }
}
%>

<html>
<%@include file="partials/head.jsp" %>
<body>
<%@include file="partials/navbar.jsp"%>

<div class="container">
<h3 class="mt-4">Login Form</h3>
<form method="POST" action="/login.jsp">

    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>

    <input type="submit">
</form>

<%@include file="partials/script_tags.jsp" %>
</div>
</body>
</html>
