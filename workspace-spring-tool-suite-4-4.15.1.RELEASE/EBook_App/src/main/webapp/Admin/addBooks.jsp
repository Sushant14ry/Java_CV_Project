<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin : Add Books</title>
<%@include file="allCss.jsp"%>
</head>
<body style="background-color: #f0f2f2">

	<%@include file="navbar.jsp"%>
	<c:if test="${empty userObj }">
		<c:redirect url="../Login.jsp" />
	</c:if>
	<div class="container mt-2">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Add Books</h4>

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
						<form action="../AddBooks" method="post"
							enctype="multipart/form-data">
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
								<label>Book Categories</label> <select class="form-control"
									name="bookcategory">
									<option>---- Select Book ----</option>
									<option value="new">New Book</option>
									<option value="old">Old Book</option>
								</select>
							</div>
							<div class="form-group">
								<label>Book Satatus</label> <select class="form-control"
									name="bookstatus">
									<option>---- Select ----</option>
									<option value="active">Active</option>
									<option value="inactive">InActive</option>
								</select>
							</div>
							<div class="form-group">
								<label>Book Photos</label> <input type="file" name="bookimg"
									class="form-control" required>
							</div>
							<button type="submit" class="btn btn-primary">Add Books</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="mt-2">
		<%@include file="footer.jsp"%>
	</div>

</body>
</html>