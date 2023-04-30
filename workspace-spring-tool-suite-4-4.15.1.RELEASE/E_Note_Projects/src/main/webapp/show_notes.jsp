<%@page import="java.util.List"%>
<%@page import="com.db.DB_Connect"%>
<%@page import="com.dao.PostDao"%>
<%@page import="com.entity.Post"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
User usr2 = (User) session.getAttribute("user_detail");
if (usr2 == null) {
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
	
	
	
	<!-- Show all Notes Content -->
	<div class="container" style="min-height: 520px">
		<h2 class="text-center">All Notes :</h2>
		
		<!-- Add Notes Alert Message -->
		<%
			String add_msgs = (String) session.getAttribute("add_msg");
			if(add_msgs != null)
			{
			%>
				<div class="alert alert-success text-center" role="alert" style="margin-bottom: 0px;">
					<%= add_msgs %>
				</div>
			<% 
				session.removeAttribute("add_msg");
			}
		%>
		
		<!-- Notes Update Alert Message -->
		<%
			String upd_msgs = (String) session.getAttribute("upd_msg");
			if(upd_msgs != null)
			{
			%>
				<div class="alert alert-success text-center" role="alert" style="margin-bottom: 0px;">
					<%= upd_msgs %>
				</div>
			<% 
				session.removeAttribute("upd_msg");
			}
		%>
		
		<!-- Notes Delete Alert Message -->
		<%
			String del_msgs = (String) session.getAttribute("delete_msg");
			if(del_msgs != null)
			{
			%>
				<div class="alert alert-danger text-center" role="alert" style="margin-bottom: 0px;">
					<%= del_msgs %>
				</div>
			<% 
				session.removeAttribute("delete_msg");
			}
			
		%>
		
		<!-- Notes Failed Delete Alert Message -->
		<%
			String f_del_msgs = (String) session.getAttribute("fail_del_nsg");
			if(f_del_msgs != null)
			{
			%>
				<div class="alert alert-danger text-center" role="alert" style="margin-bottom: 0px;">
					<%= f_del_msgs %>
				</div>
			<% 
				session.removeAttribute("fail_del_nsg");
			}
			
		%>
		<div class="row">
			<div class="col-md-12">
				<%
				if (usr2 != null) {
					PostDao pstd = new PostDao(DB_Connect.getConn());
					List<Post> pst = pstd.getAll_PostContent(usr2.getId());
					for (Post po : pst) 
					{
					%>
						<div class="card mt-3">
					<img src="image/notas.png" class="card-img-top mt-2 mx-auto"
						style="max-width: 100px">
					<div class="card-body p-4">

						<h5 class="card-title"><%= po.getP_title() %></h5>
						<p><%= po.getP_content() %></p>
						<p>
							<b class="text-success">Publish By : <%=usr2.getName() %></b><br>
							<b class="text-primary"> </b>
						</p>
						<p>
							<b class="text-success">Publish Date : <%= po.getP_date() %> </b><br> <b
								class="text-success"></b>
						</p>
						<div class="container text-center mt-2">
							<a href="Delete_servlet?note_id=<%= po.getP_id() %>" class="btn btn-danger">Delete</a>
							<a href="edit.jsp?note_id=<%= po.getP_id() %>" class="btn btn-primary">Edit</a>
						</div>
					</div>
				</div>
					
					<% 	
					}
				}
				%>
				
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