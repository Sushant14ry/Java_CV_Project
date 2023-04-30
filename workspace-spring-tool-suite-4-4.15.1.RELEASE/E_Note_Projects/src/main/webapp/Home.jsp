<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
	 	User usr2 = (User) session.getAttribute("user_detail");
		if(usr2 == null)
		{
			response.sendRedirect("login.jsp");
			session.setAttribute("login_first", "Please Login First....");
		}
	%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="allContent/allcss.jsp"%>
</head>
<body>
	<!-- Navbar Start -->
	<div>
		<%@ include file="allContent/Navbar.jsp"%>
	</div>
	<!-- Navbar End -->
	
	<div class="card text-center py-5">
		<div class="card-body">
			<img src="image/notas.png" class="img-fluid mx-auto" style="width: 350px; ">
			<h1>START TAKING YOUR NOTES</h1>
			<a href="addNotes.jsp" class="btn btn-outline-primary">Start Here</a>
		</div>
	</div>
	
	<!-- Footer Start -->
	<%@ include file="allContent/footer.jsp"%>
	<!-- Footer End -->
	
</body>
</html>