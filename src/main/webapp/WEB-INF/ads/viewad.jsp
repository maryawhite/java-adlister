<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please Log In"/>
    </jsp:include></head>
<body>

<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<div class="container">
    <div class="row mt-4">
        <div class="col-12 col-sm-6 col-lg-4">
            <div class="card mb-2 shadow border-danger">
                <div class="card-body bg-light text-dark rounded-lg">
                    <h2 class="card-title">${ad.title}</h2>
                    <p class="card-text">${ad.description}</p>
                    <p class="card-text text-muted small">Created by: ${user.username}</p>  <!--this one works, but creation date doesn't-->
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
