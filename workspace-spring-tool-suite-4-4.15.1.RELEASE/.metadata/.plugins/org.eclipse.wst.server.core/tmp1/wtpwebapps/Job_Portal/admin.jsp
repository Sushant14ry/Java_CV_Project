<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<%@include file="all_Component/all_css.jsp"%>
<style type="text/css">
.back_img {
	background-image: url("images/admin.jpg");
	width: 100%;
	height: 84vh;
	background-size: cover;
	background-repeat: no-repeat;
}
</style>
</head>
<body>

	<c:if test="${usrObj.role ne 'Admin' }">
		<c:redirect url="Login.jsp" />
	</c:if>

	<%@include file="all_Component/navbar.jsp"%>
	<div class="container-fluid back_img">
		<div class="text-center">
			<h1 class="text-white p-4 ">Welcome Admin</h1>
		</div>
	</div>

	<%@include file="all_Component/footer.jsp"%>
</body>
</html>