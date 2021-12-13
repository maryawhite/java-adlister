<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>

<div class="container">
    <h1>Here are all the ads!</h1>
    <div class="row">
    <c:forEach var="ad" items="${ads}">
            <div class="col-12 col-sm-6 col-lg-4">
                <div class="card mb-2">
                    <div class="card-body">
                        <h2 class="card-title">${ad.title}</h2>
                        <p class="card-text">${ad.description}</p>
                        <a href="${pageContext.request.contextPath}/viewad/?adId=${ad.id}">View Ad</a>  <!--this is where we are setting adId to be used in the viewAd servlet-->
                    </div>
                </div>
            </div>
    </c:forEach>
    </div>

</div>

</body>
</html>
