<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Function Tag Example</h1><hr>
	
	<c:out value="Sushant Chaudhary"></c:out>
	
	<c:set var="Channel_Name" value="Welcome to My  Channel"></c:set>
	
	<c:if test="${fn:contains(Channel_Name,'Channel') }">
		<h4>Channel Found</h4>
	</c:if>
	<hr>
	
	<h3>Contains</h3>
	<c:if test="${fn:contains(Channel_Name,'Channel') }">
		<h4>Channel Founds</h4>
	</c:if>
	<hr>

	<h3>Contains Ignore Case</h3>
	<c:if test="${fn:containsIgnoreCase(Channel_Name,'Channel') }">
		<h4>Channel Found</h4>
	</c:if>
	<hr>
	
	<h3>End With</h3>
	<c:if test="${fn:endsWith(Channel_Name,'Channel') }">
		<h4>Found Channel</h4>
	</c:if>
	<hr>
	
	<h3>Index of </h3>
	<h4>String Index of : ${fn:indexOf(Channel_Name,'to') } </h4>
	<hr>
	
	<h3>Trim </h3>
	<h4>String length Without Trim of : ${fn:length(Channel_Name) } </h4>
	
	<c:set value="${fn:trim(Channel_Name)}" var="str2"></c:set>
	<h4>String length With Trim of : ${fn:length(str2) } </h4>
	<hr>
	
	<h3>Starts With</h3>
	<c:if test="${fn:startsWith(Channel_Name,'Welcome') }">
		<h4>Found Welcome</h4>
	</c:if>
	<hr>
	
	
	
	
</body>
</html>









