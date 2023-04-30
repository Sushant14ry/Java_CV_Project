<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Error Handling in JSP</h1>
	<%
		String name = "Sushant";
		int l = name.length();
	%>
	<%="Length = "+name.length() %>
	<%="Length = "+l %>
</body>
</html>