<%@page import="com.DB.DB_Connection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_Component/all_css.jsp" %>
<style type="text/css">
.back_img{
	background-image: url("images/online.png");
	width: 100%;
	height: 84vh;
	background-size: cover;
	background-repeat: no-repeat;
	
}
</style>
</head>
<body>
	<%@include file="all_Component/navbar.jsp" %>
	
	<div class="container-fluid back_img">
		<!-- <div class="text-center">
			<h1 class="text-danger p-4 "><i class="fas fa-book"></i> Online Job Portal</h1>
		</div> -->
	</div>
	
	<%@include file="all_Component/footer.jsp" %>
</body>
</html>