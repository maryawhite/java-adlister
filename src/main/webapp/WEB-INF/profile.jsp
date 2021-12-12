<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
<%--        <h1>Welcome, ${sessionScope.user.username}!</h1>--%>
    </div>

    <div class="container">
        <div class="row">
            <c:forEach var="ad" items="${ads}">
                <div class="col-12 col-sm-6 col-lg-4">
                    <div class="card mb-3 shadow">
                        <div class="card-body">
                            <h2 class="card-title">${ad.title}</h2>
                            <p class="card-text">${ad.description}</p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>

        <form method="post" action="/delete">
            <input type="submit" name="delete" value="DELETE">
        </form>
    </div>

</body>
</html>
