<%--
  Created by IntelliJ IDEA.
  User: marywhite
  Date: 12/7/21
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Registration Form</h3>
<form method="post" action="/register">
    <label for="username">Create Username</label>
    <input id="username" name="username" class="form-control" type="text">

    <label for="email">Enter Email</label>
    <input id="email" name="email" class="form-control" type="text">

    <label for="password">Create Password</label>
    <input id="password" name="password" class="form-control" type="password">

    <input type="submit" class="btn btn-primary btn-block" value="Register">


</form>

</body>
</html>
