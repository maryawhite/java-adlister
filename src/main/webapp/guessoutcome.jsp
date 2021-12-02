<%--
  Created by IntelliJ IDEA.
  User: marywhite
  Date: 12/2/21
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <%@include file="partials/head.jsp"%>
</head>
<body>
<%@include file="partials/navbar.jsp"%>

<p>If correct, the user will be redirected to /correct or /incorrect, depending on if they guess correctly.
  In either case, the user will see the same view but with an outcome-specific message in a heading (e.g. "You Won!" or "You Lose!")
One servlet will redirect to the </p>

<p>You ${message}</p>  <!--the message will either be "you win" or "you lose"-->

</body>
</html>
