<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL CORE Tag Example</h1>
	<hr>
	<c:out value="Sushant Chaudhary"></c:out>
	
	<hr>
	<c:import url="navbar.jsp" var="data"></c:import>
	<h1>
		<c:out value="${data}"></c:out>
	</h1>
	<hr>
	
<%-- 	<c:set var="result" value="${400*4}" scope="session"></c:set>
	<h4>Before : <c:out value="${result}"> </c:out></h4>
	<hr> --%>
	
	<c:catch var="exception">
		<% 
			
			String name = null;
			name.toUpperCase();
		%>	
	
	</c:catch>
	
	<c:if test="${exception != null}"></c:if>
	<p>${exception}</p>
	<p>${exception.message}</p>
	
	<hr>
	<%-- <c:set value="${20}" var="age"></c:set>
	<c:if test="${age>18}">
		<h1>Adult</h1>
	</c:if> --%>
	
	<c:set value="${20}" var="age"></c:set>
	<c:choose>
		<c:when test="${age>10}">
			<h1>Adult</h1>
		</c:when>
		
		<c:when test="${age<10}">
			<h1>Child</h1>
		</c:when>
		
		<c:otherwise>
			<h1>Invalid Age</h1>
		</c:otherwise>
		
	</c:choose>
	<hr>
	
	<c:forEach var="num" begin="1" end="10">
		<c:out value="${num}"></c:out>
	</c:forEach>
	<hr>
	
	<c:forTokens items="Sushant,Chaudhary,Software" delims="," var="newString">
		<c:out value="${newString}"></c:out><p/>
	</c:forTokens>
	<hr>
	
	<c:url value="/index.jsp" var="pageUrl">
		<c:param name="em" value="csushant224@gmail.com"></c:param>
		<c:param name="psw" value="csushant.com"></c:param>
	</c:url>
	
	<c:out value="${pageUrl}"></c:out>
	<hr>
	
	<c:redirect url="https://www.google.com"></c:redirect>
	
	<hr>
	<hr>
	
</body>
</html>