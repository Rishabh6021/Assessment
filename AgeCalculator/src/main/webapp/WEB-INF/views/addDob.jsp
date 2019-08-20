<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add date of birth</title>
</head>
<body>


<form:form action="addDob" method="post">
<label>Date</label>
<form:input path="date"/>
<label>Month</label>
<form:input path="month"/>
<label>Year</label>
<form:input path="year"/>

<input type="submit" value="Add">
</form:form>
</body>
</html>