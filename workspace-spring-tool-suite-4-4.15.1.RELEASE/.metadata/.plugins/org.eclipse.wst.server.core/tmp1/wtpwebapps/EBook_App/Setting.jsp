<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User : Settings</title>
<%@include file="allcomponent/allCss.jsp"%>
<style type="text/css">
a {
	text-decoration: none;
	color: black;
}

a:hover {
	text-decoration: none;
}
</style>
</head>
<body style="background-color: #f0f1f2">
	<%@include file="allcomponent/navbar.jsp"%>

	<c:if test="${empty userObj }">
		<c:redirect url="Login.jsp" />
	</c:if>

	<div class="container">
		<h3 class="text-center mt-4">Hello : ${userObj.name }</h3>
		<div class="row p-5">
			<div class="col-md-4">
				<a href="SellBook.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary mb-2">
								<i class="fas fa-book-open fa-3x"></i>
							</div>
							<h4>Sell Old Book</h4>
						</div>
					</div>
				</a>
			</div>
			<div class="col-md-4">
				<a href="user_all_old_Books.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary mb-2">
								<i class="fas fa-edit fa-3x"></i>
							</div>
							<h4>All Old Books</h4>
						</div>
					</div>
				</a>
			</div>
			<div class="col-md-4">
				<a href="Edit_Profile.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary mb-2">
								<i class="fas fa-edit fa-3x"></i>
							</div>
							<h4>( Edit Profile )</h4>
						</div>
					</div>
				</a>
			</div>
			<div class="col-md-6 mt-3">
				<a href="Order.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-danger mb-2">
								<i class="fas fa-box-open fa-3x"></i>
							</div>
							<h4>My Order</h4>
							<p>Track Your Order</p>
						</div>
					</div>
				</a>
			</div>
			<div class="col-md-6 mt-3">
				<a href="Help_center.jsp">
					<div class="card">
						<div class="card-body text-center">
							<div class="text-primary mb-2">
								<i class="fas fa-user-circle fa-3x"></i>
							</div>
							<h4>Help Center</h4>
							<p>24 * 7 Service</p>
						</div>
					</div>
				</a>
			</div>
		</div>
	</div>

	<%@include file="allcomponent/footer.jsp"%>

</body>
</html>