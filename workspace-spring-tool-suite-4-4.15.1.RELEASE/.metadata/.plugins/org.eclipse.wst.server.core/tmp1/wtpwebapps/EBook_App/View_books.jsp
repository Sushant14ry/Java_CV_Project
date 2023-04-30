<%@page import="com.Entity.Book_Details"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DB_Connect"%>
<%@page import="com.DAO.BookADO_impl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Book Page</title>
<%@include file="allcomponent/allCss.jsp"%>
<style type="text/css">
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
<body style="background-color: #f0f1f2;">
	<%@include file="allcomponent/navbar.jsp"%>
	<%
	int vbkid = Integer.parseInt(request.getParameter("bid"));
	BookADO_impl dao = new BookADO_impl(DB_Connect.getConnect());
	Book_Details b = dao.getBookById(vbkid);
	%>
	<div class="container p-3">
		<div class="row ">
			<div class="col-md-6 text-center p-5 border bg-white">
				<img src="book_Photos/<%=b.getBookimg()%>"
					style="height: 150px; width: 150px; margin-bottom: 12px;"><br>
				<h5>
					Book Name : <span class="text-success"><%=b.getBookname()%></span>
				</h5>
				<h5>
					Book Author : <span class="text-success"><%=b.getBookauthor()%></span>
				</h5>
				<h5>
					Book Category : <span class="text-success"><%=b.getBookcategory()%></span>
				</h5>
			</div>
			<div class="col-md-6 text-center p-5 border bg-white">
				<h2><%=b.getBookname()%></h2>
				<%
				if (b.getBookcategory().equals("old")) {
				%>
				<h5 class="text-primary">Contact To Seller</h5>
				<h5 class="text-primary">
					<i class="fas fa-envelope 2x mb-2"></i> Email :
					<%=b.getEmail()%></h5>
				<%
				}
				%>
				<div class="row mt-4">
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fas fa-money-bill-wave fa-2x mb-2"></i>
						<p>Cash On Delivery</p>
					</div>
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fas fa-undo fa-2x mb-2"></i>
						<p>Return Available</p>
					</div>
					<div class="col-md-4 text-danger text-center p-2">
						<i class="fas fa-truck-moving fa-2x mb-2"></i>
						<p>Free Shipping</p>
					</div>
				</div>

				<%
				if (b.getBookcategory().equals("old")) {
				%>
					<div class=" text-center">
						<a href="index.jsp" class="btn btn-success"><i class="fas fa-cart-plus"></i>
							Continue Shopping</a> <a href="" class="btn btn-danger"><i
							class="fas fa-rupee-sign"></i> <%=b.getBookprice()%></a>
					</div>
				<%
				} else {
				%>
				<div class=" text-center">
					<a href="" class="btn btn-primary"><i class="fas fa-cart-plus"></i>
						Add Cart</a> <a href="" class="btn btn-danger"><i
						class="fas fa-rupee-sign"></i> <%=b.getBookprice()%></a>
				</div>
				<%
				}
				%>


			</div>
		</div>
	</div>

</body>
</html>