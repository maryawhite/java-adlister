<%--
  Created by IntelliJ IDEA.
  User: marywhite
  Date: 12/3/21
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />

<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h1>${ad.title}</h1>
        <p>${ad.description}</p>
<%--        <p class="text-muted small">Ad id: ${ad.id}, Ad userid: ${ad.userId} </p>--%>
    </div>
</c:forEach>

</body>
</html>
