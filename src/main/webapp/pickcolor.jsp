<%--
  Created by IntelliJ IDEA.
  User: marywhite
  Date: 12/1/21
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <%@include file="partials/head.jsp"%>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
<h3>What's your favorite color?</h3>
<form method="post" action="/pickcolor">

  <label for="color">Type your favorite color</label>
  <input type="text" name="color" id="color" placeholder="Type in your favorite color.">
  <br>

  <input type="submit">

</form>


</body>
</html>
