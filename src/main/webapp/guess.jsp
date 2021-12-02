<%--
  Created by IntelliJ IDEA.
  User: marywhite
  Date: 12/2/21
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%@include file="partials/head.jsp"%>
</head>
<body>
<%@include file="partials/navbar.jsp"%>

<h1>Pick a Number</h1>
<form method="post" action="/guess">

  <label for="number">Pick a number between 1 and 3</label>
  <input type="text" name="number" id="number" placeholder="enter a number from 1-3">
  <br>

  <input type="submit">

</form>

</body>
</html>
