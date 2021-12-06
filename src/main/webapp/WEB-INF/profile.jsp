<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


    <div class="container">
        <h1>Viewing your profile.</h1>
    </div>

    <p>Welcome ${user}!</p>

<!--trying to add a logout button. when the user clicks logout, it should take them to the logout servlet, which invalidates the session and redirects to the log in view-->
    <form action="/logout" method="post">
        <input type="submit" value="Logout"/>
    </form>

</body>
</html>
