<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>User Dashboard</h2>
	<c:if test="${not empty userObj}">
		<h5 class="text-center text-danger">Name : ${userObj.name }</h5>
		<h5 class="text-center text-danger">Email : ${userObj.email }</h5>
		<c:remove var="failMsg" scope="session" />
	</c:if>
</body>
</html>