<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="allcomponent/allCss.jsp"%>
</head>
<body>
	<%@include file="allcomponent/navbar.jsp"%>
	
	<!-- Check Out Or Order Message -->
	
	<c:if test="${ not empty ordrMsg }">
		<div class="alert alert-success text-center" role="alert">${ordrMsg }</div>
		<c:remove var="ordrMsg" scope="session" />
	</c:if>
	<c:if test="${ not empty fordrMsg }">
		<div class="alert alert-danger text-center" role="alert">${fordrMsg }</div>
		<c:remove var="fordrMsg" scope="session" />
	</c:if>
	
	<div class="container text-center mt-3">
		<h1>Thank You</h1>
		<h2>Your Order Successfully</h2>
		<h5>With in 7 Days your Product will be Delivered in Your Address</h5>
		<a href="index.jsp" class="btn btn-primary mt-3">Home</a>
		<a href="Order.jsp" class="btn btn-warning mt-3">View Order</a>
	</div>
	
</body>
</html>