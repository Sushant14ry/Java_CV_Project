<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SingUp Page</title>
<%@include file="all_Component/all_css.jsp"%>
</head>
<body style="background-color: #f0f1f2; ">
	<%@include file="all_Component/navbar.jsp"%>

	<div class="container-fluid">
		<div class="row p-5">
			<div class="col-md-4 offset-md-4">
				<div class="card">
					<div class="card-body">
						<div class="text-center">
							<i class="fas fa-user-plus fa-2x"></i>
							<h5>Registration</h5>
						</div>
						<c:if test="${not empty regsfMsg }">
							<div class="alert alert-danger text-center" role="alert">${regsfMsg}</div>
							<c:remove var="regsfMsg" scope="session" />
						</c:if>
						<form action="register_user" method="post">
						<div class="form-group">
								<label>Enter Full Name </label> <input type="text"
									class="form-control" name="name"
									placeholder="Enter Full Name" required>
							</div>
							<div class="form-group">
								<label>Enter Email </label> <input type="email"
									class="form-control" name="email"
									placeholder="Enter Email address" required>
							</div>
							<div class="form-group">
								<label>Enter Qualification </label> <input type="text"
									class="form-control" name="qualification"
									placeholder="Enter Qualification" required>
							</div>
							<div class="form-group">
								<label>Set Password </label> <input type="password" name="psw"
									class="form-control" placeholder="Set Your Password" required>
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