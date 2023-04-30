<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User : Edit Profile</title>
<%@include file="allcomponent/allCss.jsp"%>
</head>
<body style="background-color: #f0f1f2">
	<%@include file="allcomponent/navbar.jsp"%>

	<div class="container">
		<div class="row p-2">
			<div class="col-md-4 offset-md-4 col-sm-6 offset-sm-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-primary p-1">Edit Profile</h4>

						<!-- Show Update Profile message Start -->
						<c:if test="${not empty pswcucMsg }">
							<h5 class="text-center text-success">${pswcucMsg }</h5>
							<c:remove var="pswcucMsg" scope="session" />
						</c:if>
						<!-- Show message Start -->

						<!-- Show Update Profile message Start -->
						<c:if test="${not empty pswfMsg }">
							<h5 class="text-center text-success">${pswfMsg }</h5>
							<c:remove var="pswfMsg" scope="session" />
						</c:if>
						<!-- Show message Start -->


						<form action="update_profile" method="post">
							<input type="hidden" value="${ userObj.id }" name="id">
							<div class="form-group">
								<label>Full Name*</label> <input type="text"
									value="${ userObj.name }" name="name" class="form-control"
									required>
							</div>
							<div class="form-group">
								<label>Email Address*</label> <input type="email"
									value="${ userObj.email }" name="email" class="form-control"
									required>
							</div>
							<div class="form-group">
								<label>Phone*</label> <input type="text"
									value="${userObj.phone }" name="phone" class="form-control"
									required>
							</div>
							<div class="form-group">
								<label>Password*</label> <input type="password" name="password"
									class="form-control" required>
							</div>
							<button type="submit" class="btn btn-primary">Update
								Profile</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>