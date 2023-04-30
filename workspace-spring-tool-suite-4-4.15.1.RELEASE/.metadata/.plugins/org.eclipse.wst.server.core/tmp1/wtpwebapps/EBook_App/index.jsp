<%@page import="com.Entity.User"%>
<%@page import="com.Entity.Book_Details"%>
<%@page import="java.util.List"%>
<%@page import="com.DAO.BookADO_impl"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.DB.DB_Connect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EBook</title>
<%@include file="allcomponent/allCss.jsp"%>
<style type="text/css">
.bg_img {
	background-image: url("image/ebook.jpg");
	height: 50vh;
	width: 100%;
	background-repeat: no-repeat;
	background-size: cover;
}

.recentBook {
	margin-bottom: 8px;
}

.recentBook:hover {
	background-color: #f7f7f7;
}

.card-body p {
	height: 16px;
}

.justify-content-center a {
	margin-bottom: 4px;
}
</style>
</head>
<body style="background-color: #fcf7f7">

	<%
	User u = (User) session.getAttribute("userObj");
	%>

	<%@include file="allcomponent/navbar.jsp"%>

	<div class="container-fluid bg_img">
		<h2 class="text-center text-danger p-4">
			<i class="fas fa-home"></i> Ebook Management System
		</h2>
	</div>

	<!-- Recent Book Start -->
	<div class="container">
		<h3 class="text-center p-2">Recent Book</h3>
		<div class="row">
			<%
			BookADO_impl dao2 = new BookADO_impl(DB_Connect.getConnect());
			List<Book_Details> list2 = dao2.getRecentBooks();
			for (Book_Details bd : list2) {
			%>
			<div class="col-lg-3 col-md-4 col-sm-6 col-12">
				<div class="card recentBook">
					<div class="card-body text-center">
						<img src="book_Photos/<%=bd.getBookimg()%>" class="img-thumbnail"
							style="width: 150px; height: 200px; margin-bottom: 12px;">
						<p><%=bd.getBookname()%></p>
						<p><%=bd.getBookauthor()%></p>

						<%
						if (bd.getBookcategory().equals("old")) {
						%>
						<p>
							Categories :
							<%=bd.getBookcategory()%>
						</p>
						<div class="row mt-4 justify-content-center">
							<a href="View_books.jsp?bid=<%=bd.getBookid()%>"
								class="btn btn-success btn-sm ml-1">View Details</a> <a href=""
								class="btn btn-danger btn-sm ml-1"><%=bd.getBookprice()%></a>
						</div>
						<%
						} else {
						%>
						<p>
							Categories :
							<%=bd.getBookcategory()%>
						</p>
						<div class="row mt-4 justify-content-center">
							<%
							if (u == null) {
							%>
							<a href="Login.jsp" class="btn btn-danger btn-sm ml-2"><i
								class="fas fa-cart-plus"></i> Add Cart</a>
							<%
							} else {
							%>
							<a href="cart?bid=<%=bd.getBookid()%>&&uid=<%=u.getId()%>"
								class="btn btn-danger btn-sm ml-2"><i
								class="fas fa-cart-plus"></i> Add Cart</a>
							<%
							}
							%>
							<a href="View_books.jsp?bid=<%=bd.getBookid()%>"
								class="btn btn-success btn-sm ml-1">View Details</a> <a href=""
								class="btn btn-danger btn-sm ml-1"><%=bd.getBookprice()%></a>
						</div>
						<%
						}
						%>
					</div>
				</div>
			</div>
			<%
			}
			%>
		</div>
		<div class="text-center mt-2">
			<a href="All_recentBooks.jsp"
				class="btn btn-danger btn-sm text-white">View All</a>
		</div>
	</div>
	<!-- Recent Book End -->

	<hr>
	<!-- New Book Start -->
	<div class="container">
		<h3 class="text-center">New Book</h3>
		<div class="row">

			<%
			BookADO_impl dao = new BookADO_impl(DB_Connect.getConnect());
			List<Book_Details> list = dao.getNewBooks();
			for (Book_Details b : list) {
			%>
			<div class="col-lg-3 col-md-4 col-sm-6 col-12">
				<div class="card recentBook">
					<div class="card-body text-center">
						<img src="book_Photos/<%=b.getBookimg()%>" class="img-thumbnail"
							style="width: 180px; height: 200px; object-fit: cover; margin-bottom: 12px;">
						<p><%=b.getBookname()%></p>
						<p><%=b.getBookauthor()%></p>
						<p>
							Categories :
							<%=b.getBookcategory()%></p>
						<div class="row mt-4 justify-content-center">
							<%
							if (u == null) {
							%>
							<a href="Login.jsp" class="btn btn-danger btn-sm ml-2"><i
								class="fas fa-cart-plus"></i> Add Cart</a>
							<%
							} else {
							%>
							<a href="cart?bid=<%=b.getBookid()%>&&uid=<%=u.getId()%>"
								class="btn btn-danger btn-sm ml-2"><i
								class="fas fa-cart-plus"></i> Add Cart</a>
							<%
							}
							%>
							<a href="View_books.jsp?bid=<%=b.getBookid()%>"
								class="btn btn-success btn-sm ml-1">View Details</a> <a href=""
								class="btn btn-danger btn-sm ml-1"><%=b.getBookprice()%></a>
						</div>
					</div>
				</div>
			</div>
			<%
			}
			%>
		</div>
		<div class="text-center mt-2">
			<a href="All_newBooks.jsp" class="btn btn-danger btn-sm text-white">View
				All</a>
		</div>
	</div>
	<!-- New Book End -->
	<hr>
	<!-- Old Book Start -->
	<div class="container">
		<h3 class="text-center">Old Book</h3>
		<div class="row">
			<%
			BookADO_impl oldbk = new BookADO_impl(DB_Connect.getConnect());
			List<Book_Details> listb = oldbk.getOldBooks();
			for (Book_Details bds : listb) {
			%>
			<div class="col-lg-3 col-md-4 col-sm-6 col-12">
				<div class="card recentBook">
					<div class="card-body text-center">
						<img src="book_Photos/<%=bds.getBookimg()%>" class="img-thumbnail"
							style="width: 180px; height: 200px; object-fit: cover; margin-bottom: 12px;">
						<p><%=bds.getBookname()%></p>
						<p><%=bds.getBookauthor()%></p>
						<p>
							Categories :
							<%=bds.getBookcategory()%></p>
						<div class="row mt-4 justify-content-center">
							<a href="View_books.jsp?bid=<%=bds.getBookid()%>"
								class="btn btn-success btn-sm ml-1">View Details</a> <a href=""
								class="btn btn-danger btn-sm ml-1"><%=bds.getBookprice()%></a>
						</div>
					</div>
				</div>
			</div>
			<%
			}
			%>
		</div>
		<div class="text-center mt-2">
			<a href="All_oldBooks.jsp" class="btn btn-danger btn-sm text-white">View
				All</a>
		</div>
	</div>
	<!-- Old Book End -->
	<hr>

	<%@include file="allcomponent/footer.jsp"%>

</body>
</html>