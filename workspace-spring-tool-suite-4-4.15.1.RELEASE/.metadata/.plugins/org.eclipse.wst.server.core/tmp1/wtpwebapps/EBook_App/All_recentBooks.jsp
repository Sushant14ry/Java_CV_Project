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
<title>All Recent Book Page</title>
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
<body>
	<%@include file="allcomponent/navbar.jsp"%>

	<div class="container-fluid px-5">
		<h3 class="text-center p-2">Recent Book</h3>
		<div class="row">
			<%
			BookADO_impl bdrp = new BookADO_impl(DB_Connect.getConnect());
			List<Book_Details> listrp = bdrp.getAllBooksInRecentPage();
			for (Book_Details bd : listrp) {
			%>

			<div class="col-lg-3 col-md-4 col-sm-6 col-12 mb-2">
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
							<a href="Login.jsp" class="btn btn-danger btn-sm ml-2"><i
								class="fas fa-cart-plus"></i> Add Cart</a> <a
								href="View_books.jsp?bid=<%=bd.getBookid()%>"
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
	</div>

</body>
</html>