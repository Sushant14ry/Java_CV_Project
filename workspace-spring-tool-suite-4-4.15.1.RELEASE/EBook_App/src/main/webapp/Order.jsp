<%@page import="com.Entity.Book_Order"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DB_Connect"%>
<%@page import="com.DAO.Book_OrderDAO_impl"%>
<%@page import="com.Entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User : My Order</title>
<%@include file="allcomponent/allCss.jsp"%>
</head>
<body style="background-color: #f0f1f2">
	<%@include file="allcomponent/navbar.jsp"%>

	<c:if test="${empty userObj}">
		<c:redirect url="Login.jsp" />
	</c:if>

	<div class="container p-1">
		<h3 class="text-center">Your Order</h3>
		<table class="table table Striped mt-3">
			<thead class="bg-primary text-white">
				<tr>
					<th>Order ID</th>
					<th>Full Name</th>
					<th>Book Name</th>
					<th>Book Author</th>
					<th>Book Price</th>
					<th>Payment Type</th>
				</tr>
			</thead>
			<tbody>
				<%
				User u = (User) session.getAttribute("userObj");
				Book_OrderDAO_impl bodao = new Book_OrderDAO_impl(DB_Connect.getConnect());
				List<Book_Order> blist = bodao.getOrderedBooks(u.getEmail());
				for (Book_Order b : blist) {
				%>
				<tr>
					<th><%=b.getOrder_id()%></th>
					<th><%=b.getUsername()%></th>
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
</body>
</html>