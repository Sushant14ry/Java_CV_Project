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

	<div class="container" style="min-height: 494px;">
		<h1 class="text-center mt-4">Add Your Notes</h1>
		<div class="row">
			<div class="col-md-12">
				<form action="AddNotes_Servlet" method="post">
					<%
						User us = (User) session.getAttribute("user_detail");
						if(us != null)
						{
						%>
							<input type="hidden" name="userId" value="<%= us.getId() %>" >
						<%
						}				
					%>
	
					<div class="form-group">
						<label for="exampleFormControlInput1">Enter Title</label> <input
							type="text" class="form-control" name="p_title"
							placeholder="Enter Title" required>
					</div>
					<div class="form-group">
						<label for="exampleFormControlTextarea1">Description</label>
						<textarea class="form-control" name="p_content"
							rows="8" required></textarea>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Add Notes</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- Footer Start -->
		<div class="mt-5">
			<%@ include file="allContent/footer.jsp"%>
		</div>
	<!-- Footer End -->
</body>
</html>