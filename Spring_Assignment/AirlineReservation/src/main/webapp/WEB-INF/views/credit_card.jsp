<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User details</title>
</head>
<body>
<h3>Enter your account details</h3>
<form:form action="validateCardDetails" method="POST">
<label>Credit card number</label>
<form:input path="credit_card_number"/>
<br/><br/>

<label>Expiry date</label>
<form:input path="expiry_date"/>
<br/><br/>
<label>Cvv number</label>
<form:input path="cvv_number"/>
<br/><br/>

<input type="submit" value="Book">
</form:form>
</body>
</html>