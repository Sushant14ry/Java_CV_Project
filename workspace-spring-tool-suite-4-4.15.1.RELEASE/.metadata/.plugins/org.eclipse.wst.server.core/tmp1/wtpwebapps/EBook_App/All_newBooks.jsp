<%@page import="com.Entity.User"%>
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
<title>All New Book Page</title>
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

#toast {
	min-width: 300px;
	position: fixed;
	bottom: 30px;
	left: 50%;
	margin-left: -125px;
	background: #333;
	padding: 10px;
	color: white;
	text-align: center;
	z-index: 1;
	font-size: 18px;
	visibility: hidden;
	box-shadow: 0px 0px 100px #000;
}

#toast.display {
	visibility: visible;
	animation: fadeIn 0.5, fadeOut 0.5s 2.5s;
}

@
keyframe fadeIn {from { bottom:0;
	opacity: 0;
}

to {
	bottom: 30px;
	opacity: 1;
}

}
@
keyframe fadeOut {from { bottom:30px;
	opacity: 1;
}

to {
	bottom: 0;
	opacity: 0;
}
</style>
</head>
<body>

	<c:if test="${not empty addCart }">
		<div id="toast">${addCart }</div>

		<script type="text/javascript">
			showToast();
			function showToast(content){
				$('#toast').addClass("display");
				$('#toast').html(content);
				setTimeout(() => {
					$('#toast').removeClass("display");
				}, 2000);
			}
		</script>
		
		<c:remove var="addCart" scope="session"/>
	</c:if>

	<%
	User u = (User) session.getAttribute("userObj");
	%>
	<%@include file="allcomponent/navbar.jsp"%>

	<div class="container-fluid px-5">
		<h3 class="text-center p-2">New Book</h3>
		<div class="row">
			<%
			BookADO_impl bdnp = new BookADO_impl(DB_Connect.getConnect());
			List<Book_Details> listnp = bdnp.getAllBooksInNewBookPage();
			for (Book_Details bd : listnp) {
			%>

			<div class="col-lg-3 col-md-4 col-sm-6 col-12 mb-2">
				<div class="card recentBook">
					<div class="card-body text-center">
						<img src="book_Photos/<%=bd.getBookimg()%>" class="img-thumbnail"
							style="width: 150px; height: 200px; margin-bottom: 12px;">
						<p><%=bd.getBookname()%></p>
						<p><%=bd.getBookauthor()%></p>
						<p>
							Categories :
							<%=bd.getBookcategory()%></p>
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