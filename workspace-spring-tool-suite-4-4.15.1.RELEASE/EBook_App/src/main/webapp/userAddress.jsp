<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User : Edit Address</title>
<%@include file="allcomponent/allCss.jsp"%>
</head>
<body style="background-color: #f0f1f2">
	<%@include file="allcomponent/navbar.jsp"%>
	<div class="container">
		<div class="row p-2">
			<div class="col-md-8 offset-md-2 col-sm-10 offset-sm-1">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-primary p-1">Add Address</h4>
						<form action="/SellBooks" method="post">
							<div class="form-row">
								<div class="form-group col-md-6">
									<label>Address</label> <input type="text" class="form-control"
										placeholder="Full Name">
								</div>
								<div class="form-group col-md-6">
									<label>Landmark</label> <input type="text" class="form-control"
										placeholder="Email">
								</div>
								<div class="form-group col-md-6">
									<label>City</label> <input type="text" class="form-control"
										placeholder="City">
								</div>
								<div class="form-group col-md-3">
									<label>State</label> <input type="text" class="form-control"
										placeholder="State">
								</div>
								<div class="form-group col-md-3">
									<label>Pin Code</label> <input type="text" class="form-control"
										placeholder="Pin Code">
								</div>
							</div>
							<button type="submit" class="btn btn-primary text-white">Update Address</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>