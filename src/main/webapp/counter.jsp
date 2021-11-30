<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: marywhite
  Date: 11/30/21
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%--to load the page into your browser using localhost /counter.jsp--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%-- the JSP page directive --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <%-- the taglib directive for JSTL. the prefix is how we'll call it --%>
<%! int visits = 0; %>

<% if(visits == 0){
    request.setAttribute("hasUserBeenHere", false);
} else {
    request.setAttribute("hasUserBeenHere", true);
}
visits++;
%>


<%! int counter = 0; String name = "Mary"; %>  <%-- the ! indicates a variable --%>
<% counter += 1; %> <%--this counter increments every time the page is loaded--%>

<% request.setAttribute("message", "Hello, World!"); %>

<html>
<head>
  <title>Title</title>
</head>
<body>
<%@include file="navbar.jsp"%>  <%-- @include to use a partial, best practice would be to put the navbar into a directory named partial--%>

<% if (request.getParameter("reset") != null && request.getParameter("reset").equals("true")){
    counter = 0;
} %>

<p>Hello <%=name%>!</p> <%--how to evaluate your expression or variable--%>

<h1>The current count is <%= counter %>.</h1> <%--how to evaluate your expression or variable--%>
<p>The current date is <%= java.time.LocalDate.now() %></p>

<h2>Here is the message: ${message}</h2>  <%-- this grabs an existing variable and puts it on the page --%>

<c:choose>   <%-- c is the prefix from the JSTL --%>

    <c:when test="${hasUserBeenHere}">
        <h3>Welcome Back</h3>
    </c:when>
    <c:otherwise>
        <h3>Hello for the first time.</h3>
    </c:otherwise>
</c:choose>
<%-- this is a JSP comment, --%>
<%-- you will *not* see this in the html --%>


<!-- this is an HTML comment, you *will* see this in the html -->

</body>
</html>
