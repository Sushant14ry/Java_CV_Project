<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User : Sell Book</title>
<%@include file="allcomponent/allCss.jsp"%>
</head>
<body style="background-color: #f0f1f2">
	<%@include file="allcomponent/navbar.jsp"%>

	<c:if test="${empty userObj }">
		<c:redirect url="Login.jsp" />
	</c:if>

	<div class="container">
		<div class="row p-2">
			<div class="col-md-4 offset-md-4 col-sm-6 offset-sm-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-primary p-1">Sell Old Book</h4>
						<!-- Show message Start -->
						<c:if test="${not empty succMsg }">
							<p class="text-center text-success">${succMsg }</p>
							<c:remove var="succMsg" scope="session" />
						</c:if>

						<c:if test="${not empty failMsg }">
							<p class="text-center text-danger">${failMsg }</p>
							<c:remove var="failMsg" scope="session" />
						</c:if>
						<!-- Show message Start -->

						<form action="addOldBook" method="post"
							enctype="multipart/form-data">
							<input type="hidden" value="${userObj.email }" name="UserEmail"
								class="form-control">
							<div class="form-group">
								<label>Book Name</label> <input type="text" name="bookname"
									class="form-control" required>
							</div>
							<div class="form-group">
								<label>Author Name</label> <input type="text" name="bookauthor"
									class="form-control" required>
							</div>
							<div class="form-group">
								<label>Book Price</label> <input type="number" name="bookprice"
									class="form-control" required>
							</div>
							<div class="form-group">
								<label>Book Photos</label> <input type="file" name="bookimg"
									class="form-control" required>
							</div>
							<button type="submit" class="btn btn-primary">Sell Books</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>