<%@ page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="allContent/allcss.jsp"%>
<style type="text/css">
.book_img {
	background:
		url("https://www.halek.co/teaching/phd-seminar/featured.jpg");
	width: 100%;
	height: 78.5vh;
	background-size: cover;
	background-repeat: no-repeat;
	position: relative;
}
.photo_details{
	margin-top: 8%;
	position: absolute;
	width: 99%;
	text-align: center;
}

</style>
</head>
<body>
	<!-- Navbar Start -->
	<div>
		<%@ include file="allContent/Navbar.jsp"%>
	</div>
	<!-- Navbar End -->
	
	<div class="container-fluid book_img">
		<div class=" photo_details">
			<h1 class="text-white mb-4">
				<i class="fa fa-book" aria-hidden="true"></i> E Notes Save your
				Notes
			</h1>
			<a href="login.jsp" class="btn btn-light"><i
				class="fa fa-user-circle" aria-hidden="true"></i> Login</a> 
			<a href="register.jsp" class="btn btn-light"><i
				class="fa fa-user-plus" aria-hidden="true"></i> Register</a>
		</div>
	</div>

	<!-- Footer Start -->
	<%@ include file="allContent/footer.jsp"%>
	<!-- Footer End -->

</body>
</html>