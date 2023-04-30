<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<%@include file="all_Component/all_css.jsp"%>
</head>
<body style="background-color: #f0f1f2;">
	<%@include file="all_Component/navbar.jsp"%>

	<div class="container-fluid">
		<div class="row p-5">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<div class="text-center">
							<i class="fas fa-user-plus fa-2x"></i>
							<h5>Login Page</h5>
						</div>
						<!-- Admin Login -->
						<c:if test="${not empty regsMsg }">
							<div class="alert alert-success text-center" role="alert">${regsMsg}</div>
							<c:remove var="regsMsg" scope="session" />
						</c:if>
						
						<!-- Register User Login -->
						<c:if test="${not empty regsMsg }">
							<div class="alert alert-success text-center" role="alert">${regsMsg}</div>
							<c:remove var="regsMsg" scope="session" />
						</c:if>
						
						<!-- Register User Login -->
						<c:if test="${not empty fregMsg }">
							<div class="alert alert-danger text-center" role="alert">${fregMsg}</div>
							<c:remove var="fregMsg" scope="session" />
						</c:if>
						
						<!-- Logout User OR Admin -->
						<c:if test="${not empty logsMsg }">
							<div class="alert alert-danger text-center" role="alert">${logsMsg}</div>
							<c:remove var="logsMsg" scope="session" />
						</c:if>
						
						<form action="Login" method="post">
							<div class="form-group">
								<label>Enter Email </label> <input type="email"
									class="form-control" name="email"
									placeholder="Enter Email address" required>
							</div>
							<div class="form-group">
								<label>Enter Password </label> <input type="password" name="psw"
									class="form-control" placeholder="Enter Email address" required>
							</div>
							<button type="submit"
								class="btn btn-primary badge-pill btn-block">Login</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>