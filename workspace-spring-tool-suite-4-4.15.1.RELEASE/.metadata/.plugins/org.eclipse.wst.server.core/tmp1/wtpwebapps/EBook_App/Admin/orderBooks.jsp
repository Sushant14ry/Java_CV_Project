<%@page import="com.Entity.Book_Order"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DB_Connect"%>
<%@page import="com.DAO.Book_OrderDAO_impl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin : Ordered Books</title>
<%@include file="allCss.jsp"%>
</head>
<body style="background-color: #f0f2f2">

	<%@include file="navbar.jsp"%>

	<c:if test="${empty userObj }">
		<c:redirect url="../Login.jsp" />
	</c:if>

	<h3 class="text-center">Hello Admin</h3>

	<div class="container-fluid mt-2">
		<div class="table-responsive"
			style="min-height: 530px; max-height: 530px;">
			<table class="table table-striped">
				<thead class="bg-primary text-white">
					<tr>
						<th>Order ID</th>
						<th>Order Name</th>
						<th>Email</th>
						<th>Address</th>
						<th>Phone No</th>
						<th>Book Name</th>
						<th>Author Name</th>
						<th>Book Price</th>
						<th>Payment Type</th>

					</tr>
				</thead>
				<tbody>
					<%
					Book_OrderDAO_impl bdao = new Book_OrderDAO_impl(DB_Connect.getConnect());
					List<Book_Order> blist = bdao.getAllOrderedBooks();
					for (Book_Order b : blist) {
					%>
					<tr>
						<th><%=b.getOrder_id()%></th>
						<th><%=b.getUsername()%></th>
						<th><%=b.getUseremail()%></th>
						<th><%=b.getFulladdress()%></th>
						<th><%=b.getPhone()%></th>
						<th><%=b.getBook_name()%></th>
						<th><%=b.getBook_author()%></th>
						<th><%=b.getBook_price()%></th>
						<th><%=b.getPayment()%></th>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
		</div>
	</div>

	<div class="mt-2">
		<%@include file="footer.jsp"%>
	</div>
</body>
</html>