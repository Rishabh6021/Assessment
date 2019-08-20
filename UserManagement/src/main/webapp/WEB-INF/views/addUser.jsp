<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!--     %@ page,taglib are directives in jsp uri="Ctrl+Spacebar -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add user</title>
</head>
<body>


<form:form action="addUser" method="post">
<!-- We need explicitly tell commandName in form tag if its named other than command,in DoctorController.java  -->

<label>UserName</label>
<form:input path="name"/>
<label>Email</label>
<form:input path="email"/>
<label>Contact</label>
<form:input path="contact"/>
<label>City</label>
<form:select path="city" items="${depts}"/>
<label>Zip code</label>
<form:input path="zipcode"/></span>
<form:errors path="zipcode"/></span>
<input type="submit" value="Add">
</form:form>
</body>
</html>