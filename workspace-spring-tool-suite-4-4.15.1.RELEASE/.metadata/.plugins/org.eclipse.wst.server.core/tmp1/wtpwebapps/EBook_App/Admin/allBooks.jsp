<%@page import="com.Entity.Book_Details"%>
<%@page import="java.util.List"%>
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
<title>Admin : All Books</title>
<%@include file="allCss.jsp"%>
</head>
<body style="background-color: #f0f2f2">

	<%@include file="navbar.jsp"%>
	<c:if test="${empty userObj }">
		<c:redirect url="../Login.jsp" />
	</c:if>
	
	<h3 class="text-center p-2">Hello Admin</h3>

	<!-- Show message Start -->
	<c:if test="${not empty esucMsg }">
		<h5 class="text-center text-success">${esucMsg }</h5>
		<c:remove var="esucMsg" scope="session" />
	</c:if>

	<c:if test="${not empty efailMsg }">
		<h5 class="text-center text-danger">${efailMsg }</h5>
		<c:remove var="efailMsg" scope="session" />
	</c:if>
	<!-- Show message Start -->

	<div class="container-fluid mt-2"
		style="min-height: 530px; max-height: 530px;">
		<div class="table-responsive"
			style="min-height: 530px; max-height: 530px;">
			<table class="table table-striped">
				<thead class="bg-primary text-white">
					<tr>
						<th>ID</th>
						<th>Book Name</th>
						<th>Book Photos</th>
						<th>Book Author</th>
						<th>Book Price</th>
						<th>Book Categories</th>
						<th>Book Status</th>
						<th>User Email</th>
						<th colspan="2">Action</th>
					</tr>
				</thead>
				<tbody>
					<%
					BookADO_impl dao = new BookADO_impl(DB_Connect.getConnect());
					List<Book_Details> list = dao.getAllBooks();
					for (Book_Details b : list) {
					%>
					<tr>
						<th>EBK<%=b.getBookid()%></th>
						<td><%=b.getBookname()%></td>
						<td><img src="../book_Photos/<%=b.getBookimg()%>"
							style="width: 50px; height: 50px;"></td>
						<td><%=b.getBookauthor()%></td>
						<td><%=b.getBookprice()%></td>
						<td><%=b.getBookcategory()%></td>
						<td><%=b.getBookstatus()%></td>
						<td><%=b.getEmail()%></td>
						<td>
							<a href="EditBooks.jsp?ids=<%=b.getBookid()%>"
								class="btn btn-success mb-1"><i class="fas fa-edit"></i> Edit</a> 
							<a href="../delete?ids=<%=b.getBookid()%>" class="btn btn-danger mb-1"><i class="fas fa-trash-alt"></i> Delete</a></td>
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