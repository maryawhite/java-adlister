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

<form method="POST" action="/pizza-order">

    <label for="address">Address</label>
    <input type="text" name="address" id="address" placeholder="input your delivery address">
    <br>

    <label for="crust_preference">Select Crust</label>
    <select name="crust_preference" id="crust_preference">
        <option value="hand-tossed">Hand Tossed</option>
        <option value="crispy-thin">Crispy Thin</option>
    </select>
    <br>

    <label for="sauce_amount_preference">Sauce Amount</label>
    <select name="sauce_amount_preference" id="sauce_amount_preference">
        <option value="light">Light</option>
        <option value="normal">Normal</option>
        <option value="extra">Extra</option>
    </select>
    <br>

    <label for="sauce_type_preference">Sauce Type</label>
    <select name="sauce_type_preference" id="sauce_type_preference">
        <option value="marinara">Marinara Sauce</option>
        <option value="bbq">BBQ Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
    </select>
    <br>

    <p>Select Toppings </p>
    <label for="meattopping1"><input type="checkbox" id="meattopping1" name="meattopping" value="Meatballs">
    Meatballs</label><br>

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
    <br>

    <select name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br>



    <input type="submit">
</form>

<%--this part below here isn't working:--%>
<p>Your order:
    <ul>
    <li>crust - ${crust}</li>
    <li>sauce - ${sauce}, ${sauceAmount}</li>
    <li>meat toppings - ${meattoppings}</li>
    <li>veggie toppings - ${veggietoppings}</li>
</ul>

<p>Your delivery address: ${address}</p>

</p>

</body>
</html>
