<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
		<c:when test="${mode=='MODE_REGISTER' }">
			<div class="container text-center">
				<h3>Enter your details to enjoy your trip!!</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="/validate">
					<input type="hidden" name="id" value="${user.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name"
								value="${user.name }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Street</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="street"
								value="${user.street }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">City</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="city"
								value="${user.city }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">State</label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="state"
								value="${user.state }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Contact Number</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="contact_number"
								value="${user.contact_number }" />
						</div>
					</div>
					<br/>
					<div class="form-group ">
						 <input type="submit" class="btn btn-primary" value="Continue" />
					</div>
				</form>
			</div>
		</c:when>
		</c:choose>

</body>
</html>