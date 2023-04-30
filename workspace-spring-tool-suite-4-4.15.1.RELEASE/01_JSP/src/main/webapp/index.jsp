<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background : green;">
	<h1>Hello World</h1>
		
	<h2>Declaration Tag</h2>
	<% int a=10; String name="Sushant";  %>
	<br>
	<hr>
	<h3>Expression Tag : <%=a %> <%=name %></h3>
	
	<br>
	<hr>
	<h2>Scriptlet Tag</h2>
	<% 
		int sum = 20+30;
		out.println("Sum : "+sum);
		
		int sub = sum-30;
		out.println("Sub : "+sub);
		
	%>
	
	<h1 style="color:red;">Sum = <%=sum %></h1>
	<h1>Sub = <%=sub %></h1>
</body>
</html>