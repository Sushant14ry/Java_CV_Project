<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Job Page</title>
<%@include file="all_Component/all_css.jsp"%>
</head>
<body>
	<c:if test="${usrObj.role ne 'Admin' }">
		<c:redirect url="Login.jsp" />
	</c:if>
	<%@include file="all_Component/navbar.jsp"%>

	<div class="container p-2">
		<div class="col-md-10 offset-md-1"></div>
		<div class="card">
			<div class="card-body">
				<div class="text-center  text-success">
					<i class="fas fa-user-friends fa-3x"></i>
					<h5>Add Jobs</h5>
					<c:if test="${not empty adjMsg }">
						<div class="alert alert-success" role="alert">${adjMsg}</div>
						<c:remove var="adjMsg" scope="session" />
					</c:if>
					<c:if test="${not empty adjfMsg }">
						<div class="alert alert-success" role="alert">${adjfMsg}</div>
						<c:remove var="adjfMsg" scope="session" />
					</c:if>
				</div>
				<form action="add_job" method="post">
					<div class="form-group">
						<label>Enter Title</label> <input type="text" name="title"
							class="form-control" required>
					</div>
					<div class="form-row">
						<div class="form-group col-md-4">
							<label>Location</label> <select name="location"
								class="custom-select">
								<option selected>Choose........</option>
								<option value="Kathmandu">Kathmandu</option>
								<option value="Hetauda">Hetauda</option>
								<option value="Pokhara">Pokhara</option>
								<option value="Birgunj">Birgunj</option>
								<option value="Janakput">Janakput</option>
							</select>
						</div>
						<div class="form-group col-md-4">
							<label>Category</label> <select name="category"
								class="custom-select">
								<option selected>Choose........</option>
								<option value="IT">IT</option>
								<option value="Devloper">Devloper</option>
								<option value="Banking">Banking</option>
								<option value="Engineer">Engineer</option>
								<option value="Teacher">Teacher</option>
							</select>
						</div>
						<div class="form-group col-md-4">
							<label>Status</label> <select name="status" class="custom-select">
								<option selected>Choose........</option>
								<option value="Active">Active</option>
								<option value="Inactive">Inactive</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label>Enter Description</label>
						<textarea rows="6" cols="12" class="form-control"
							name="description" required></textarea>
					</div>
					<button class="btn btn-success">Publish Job</button>
				</form>
			</div>
		</div>
	</div>

	<%@include file="all_Component/footer.jsp"%>
</body>
</html>