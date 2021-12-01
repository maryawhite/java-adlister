<%--
  Created by IntelliJ IDEA.
  User: marywhite
  Date: 12/1/21
  Time: 12:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%@include file="partials/head.jsp"%>
</head>
<body>
<%@include file="partials/navbar.jsp"%>

<form method="POST" action="pizza-order.jsp/">

    <label for="address">Address</label>
    <input type="text" name="address" id="address" placeholder="input your delivery address">
    <br>

    <select name="crust_preference">
        <option value="handtossed">Hand Tossed</option>
        <option value="crispythin">Crispy Thin</option>
    </select>
    <br>

    <select name="sauce_amount_preference">
        <option value="light">Light</option>
        <option value="normal">Normal</option>
        <option value="extra">Extra</option>
        <option value="double">Double</option>
    </select>
    <br>

    <select name="sauce_type_preference">
        <option value="marinara">Marinara Sauce</option>
        <option value="bbq">BBQ Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
    </select>
    <br>

    <input type="checkbox" id="meattopping1" name="meattopping" value="Meatballs">
    <label for="meattopping1">Meatballs</label><br>

    <input type="checkbox" id="meattopping2" name="meattopping" value="Bacon">
    <label for="meattopping2"> Bacon</label><br>

    <input type="checkbox" id="meattopping3" name="meattopping" value="Chicken">
    <label for="meattopping3"> Chicken</label><br>

    <input type="checkbox" id="veggietopping1" name="veggietopping" value="Mushrooms">
    <label for="veggietopping1"> Mushrooms</label><br>

    <input type="checkbox" id="veggietopping2" name="veggietopping" value="Pineapple">
    <label for="veggietopping2"> Pineapple</label><br>

    <input type="checkbox" id="veggietopping3" name="veggietopping" value="Onions">
    <label for="veggietopping3"> Onions</label><br>


    <input type="submit">
</form>

</body>
</html>
