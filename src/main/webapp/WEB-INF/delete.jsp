<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Delete my Profile"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<div class="container">
    <h1>Welcome, ${sessionScope.user.username}!</h1>
    <p>Warning, your profile and ads will be deleted.</p>
    <form action="/delete" method="post">
        <input type="submit" name="delete" value="Confirm">
    </form>
</div>


</body>
</html>
