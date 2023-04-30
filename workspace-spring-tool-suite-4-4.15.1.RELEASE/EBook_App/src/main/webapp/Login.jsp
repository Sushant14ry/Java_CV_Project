<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EBook-Login</title>
<%@include file="allcomponent/allCss.jsp"%>
</head>
<body style="background-color: #fcf7f7">
	<%@include file="allcomponent/navbar.jsp"%>

	<div class="container p-2" style="min-height: 500px">
		<div class="row">
			<div class="col-md-4 offset-md-4 ">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Login Page</h3>
						
						<!-- Show Invalid Username and Password message Start -->
						<c:if test="${not empty failMsg}">
							<h5 class="text-center text-danger">${failMsg }</h5>
							<c:remove var="failMsg" scope="session"/>
						</c:if>
						
						<!-- Show Logout message Start -->
							<c:if test="${not empty logsucMsg }">
								<h5 class="text-center text-success">${logsucMsg }</h5>
								<c:remove var="logsucMsg" scope="session" />
							</c:if>
						<!-- Show message Start -->
						
						<form action="login" method="post">
							<div class="form-group">
								<label>Email Address</label> <input type="email"
									class="form-control" name="email" placeholder="Enter Email Adress" required>
							</div>
							<div class="form-group">
								<label>Password</label> <input type="password"
									class="form-control" name="password" placeholder="Enter Password" required>
							</div>
							<div class="form-check">
								<input type="checkbox" class="form-check-input">
								<label class="form-check-label">Remember me</label>
							</div>
							<div class="text-center">
								<button type="submit" class="btn btn-primary mt-2 mb-2">Login</button><br>
								<a href="Register.jsp">Create New Account</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="allcomponent/footer.jsp"%>

</body>
</html>