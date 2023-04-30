<%@page import="com.Entity.Book_Details"%>
<%@page import="java.util.List"%>
<%@page import="com.Entity.User"%>
<%@page import="com.DB.DB_Connect"%>
<%@page import="com.DAO.BookADO_impl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User : All Old Books</title>
<%@include file="allcomponent/allCss.jsp"%>
</head>
<body style="background-color: #f0f1f2">
	<%@include file="allcomponent/navbar.jsp"%>
	<div class="container p-1">
		<h3 class="text-center mt-2">All Old Books</h3>
		
		<!-- Show message Start -->
		<c:if test="${not empty delsucMsg }">
			<p class="text-center text-success">${delsucMsg }</p>
			<c:remove var="delsucMsg" scope="session" />
		</c:if>

		<c:if test="${not empty delfailMsg }">
			<p class="text-center text-danger">${delfailMsg }</p>
			<c:remove var="delfailMsg" scope="session" />
		</c:if>
		<!-- Show message Start -->
		
		<table class="table table Striped mt-3">
			<thead class="bg-primary text-white">
				<tr>
					<th>Book ID</th>
					<th>Book Photos</th>
					<th>Book Name</th>
					<th>Book Author</th>
					<th>Book Price</th>
					<th>Book Categories</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<%
				User u = (User) session.getAttribute("userObj");
				String email = u.getEmail();

				BookADO_impl bdo = new BookADO_impl(DB_Connect.getConnect());
				List<Book_Details> oldblist = bdo.getUserOldBooks(email, "old");
				for (Book_Details od : oldblist) {
				%>
				<tr>
					<th><%=od.getBookid()%></th>
					<td><img src="book_Photos/<%=od.getBookimg()%>"
						style="width: 50px; height: 50px;"></td>
					<th><%=od.getBookname()%></th>
					<th><%=od.getBookauthor()%></th>
					<th><%=od.getBookprice()%></th>
					<th><%=od.getBookcategory()%></th>
					<td><a
						href="remove_oldBook?usremail=<%= email %>&&obid=<%= od.getBookid() %>"
						class="btn btn-danger mb-1"><i class="fas fa-trash-alt"></i>
							Delete</a></td>
					</td>
				</tr>
				<%
				}
				%>

			</tbody>
		</table>
	</div>
</body>
</html>