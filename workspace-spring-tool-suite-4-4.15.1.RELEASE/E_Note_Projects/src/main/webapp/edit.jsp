<%@page import="com.entity.Post"%>
<%@page import="com.db.DB_Connect"%>
<%@page import="com.dao.PostDao"%>
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

	<div class="container">
		<h1 class="text-center mt-4">Edit Your Notes</h1>
		<div class="row">
			<div class="col-md-12">
				<%
					int post_id = Integer.parseInt(request.getParameter("note_id"));
					
					PostDao pdo = new PostDao(DB_Connect.getConn());
					Post ps = pdo.getPost_DataById(post_id);
					
					
				%>
				<form action="EditServlet" method="post">
					<input type="hidden" value="<%= post_id %>" name="pst_id">
					<div class="form-group">
						<label for="exampleFormControlInput1">Enter Title</label> <input
							type="text" class="form-control" name="p_title" 
							placeholder="Enter Title" required value="<%=ps.getP_title() %>" >
					</div>
					<div class="form-group">
						<label for="exampleFormControlTextarea1">Description</label>
						<textarea class="form-control" name="p_content"
							rows="8" required><%=ps.getP_content() %></textarea>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Update Notes</button>
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