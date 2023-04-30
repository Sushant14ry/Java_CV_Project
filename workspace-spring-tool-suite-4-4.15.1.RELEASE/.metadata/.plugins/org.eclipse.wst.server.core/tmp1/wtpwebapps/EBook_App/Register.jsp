<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EBook-Register</title>
<%@include file="allcomponent/allCss.jsp"%>
</head>
<body style="background-color: #fcf7f7">
	<%@include file="allcomponent/navbar.jsp"%>

	<div class="container p-2">
		<div class="row">
			<div class="col-md-4 offset-md-4 ">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Registration Page</h3>
			
			<!-- Show Error Message Start -->			
						<c:if test="${not empty uinMsg }">
							<p class="text-center text-success">${uinMsg } <a href="Login.jsp" class="text-primary"> Click Here</a></p>
							
							<c:remove var="uinMsg" scope="session" />
						</c:if>
						<c:if test="${not empty failMsg }">
							<p class="text-center text-danger">${failMsg }</p>
							<c:remove var="failMsg" scope="session" />
						</c:if>
						<c:if test="${not empty chkboxMsg }">
							<p class="text-center text-danger">${chkboxMsg }</p>
							<c:remove var="chkboxMsg" scope="session" />
						</c:if>
			<!-- Show Error Message End -->
					
						<form action="register" method="post">
							<div class="form-group">
								<label>Full Name</label> <input type="text" class="form-control"
									name="name" placeholder="Enter Full Name" required>
							</div>
							<div class="form-group">
								<label>Email Adress</label> <input type="email"
									class="form-control" name="email"
									placeholder="Enter Email Adress" required>
							</div>
							<div class="form-group">
								<label>Phone No</label> <input type="text" name="phone"
									class="form-control" placeholder="Enter Phone No" required>
							</div>
							<div class="form-group">
								<label>Password</label> <input type="password" name="password"
									class="form-control" placeholder="Set Your Password" required>
							</div>
							<div class="form-check">
								<input type="checkbox" name="check" class="form-check-input">
								<label class="form-check-label">Agree Terms and
									Condition</label>
							</div>
							<button type="submit" class="btn btn-primary mt-2">Register</button>
							<br> <a href="Login.jsp" style="float: right">Already
								Account</a>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="allcomponent/footer.jsp"%>

</body>
</html>