<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<!-- <h4>success</h4> -->
	<h1>Airline Details</h1>
	<c:forEach items="${flightlist}" var="eachFlight">

		<strong>Arrival: </strong>${eachFlight.source}</br>
		<strong>Destination: </strong> ${eachFlight.destination}</br>
		<strong>Airline: </strong>${eachFlight.airline}</br>
		<strong>Flight Number: </strong> ${eachFlight.flight_number}</br>
		<strong> Price: </strong>${eachFlight.price}</br>
		<strong>Travel Time: </strong>${eachFlight.travel_time}</br>
		<strong>Available Seat: </strong>${eachFlight.available_seat}</br>

		<c:if test="${eachFlight.available_seat == 0}">
			<a href="/errormes"><input type="submit" value="BOOK"></a>
		</c:if>
		<c:if test="${eachFlight.available_seat != 0}">
			<a href="/register"><input type="submit" value="BOOK"></a>
		</c:if>
		<br/><br/>
	</c:forEach>

	<%-- <p>${flightList}</p> --%>
</body>
</html>


