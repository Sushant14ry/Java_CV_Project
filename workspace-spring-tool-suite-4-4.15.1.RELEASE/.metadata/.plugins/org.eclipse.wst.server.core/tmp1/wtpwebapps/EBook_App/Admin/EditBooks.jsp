<%@page import="com.Entity.Book_Details"%>
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
						<%
							int id = Integer.parseInt(request.getParameter("ids"));
							BookADO_impl dao = new BookADO_impl(DB_Connect.getConnect());
							Book_Details bd = dao.getBookById(id);
						%>
						<form action="../UpdateBooks" method="post">
							<input type="hidden" name="bid" value="<%= bd.getBookid()%>">
							<div class="form-group">
								<label>Book Name</label> <input type="text" name="bookname"
									value="<%=bd.getBookname()%>" class="form-control" required>
							</div>
							<div class="form-group">
								<label>Author Name</label> <input type="text" name="bookauthor"
									value="<%=bd.getBookauthor()%>" class="form-control" required>
							</div>
							<div class="form-group">
								<label>Book Price</label> <input type="number" name="bookprice"
									value="<%=bd.getBookprice()%>" class="form-control" required>
							</div>
							<div class="form-group">
								<label>Book Categories</label> <select class="form-control"
									name="bookcategory">
									<%
										if ("New".equals(bd.getBookstatus())) {
										%>
											<option value="New">Old Book</option>
											<option value="Old">New Book</option>
										<%
										} else {
										%>
											<option value="Old">New Book</option>
											<option value="New">Old Book</option>
										<%
										}
									%>
								</select>
							</div>
							<div class="form-group">
								<label>Book Satatus</label> <select class="form-control"  
									name="bookstatus">
									<%
										if ("Active".equals(bd.getBookstatus())) {
										%>
											<option value="Active">InActive</option>
											<option value="InActive">Active</option>
										<%
										} else {
										%>
											<option value="InActive">Active</option>
											<option value="Active">InActive</option>
										<%
										}
									%>
								</select>
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