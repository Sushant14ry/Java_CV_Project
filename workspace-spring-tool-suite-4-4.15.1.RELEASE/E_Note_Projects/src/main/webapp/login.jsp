<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

	<div class="container-fluid div_color ">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card mt-4">
					<div class="card-header text-center text-white bg-custom">
						<i class="fa fa-user-plus fa-3x" aria-hidden="true"></i>
						<h4>Login Page</h4>
					</div>
					<!-- Login Fail when Username and Password Invalid -->
					<%
						String InvalidMsg = (String) session.getAttribute("login_fail");
						if (InvalidMsg != null) {
					%>
					<div class="alert alert-danger text-center" role="alert" style="margin-bottom: 0px;">
						<%=InvalidMsg%>
					</div>
					<%
						session.removeAttribute("login_fail");
					}
					%>
					
					<!-- Without Login Redirect to Login Page -->
					<%
						String withoutLogin = (String) session.getAttribute("login_first");
						if (withoutLogin != null) {
					%>
						<div class="alert alert-danger text-center" role="alert" style="margin-bottom: 0px;">
							<%=withoutLogin%>
						</div>
					<%
						session.removeAttribute("login_first");
					}
					%>
					
					<!-- Logout and Redirect to Login Page -->
					<%
						String logoutMsg = (String) session.getAttribute("logout_msg");
						if (logoutMsg != null) {
					%>
						<div class="alert alert-success text-center" role="alert" style="margin-bottom: 0px;">
							<%=logoutMsg%>
						</div>
					<%
						session.removeAttribute("logout_msg");
					}
					%>
					
					<div class="card-body">
						<form action="Login_Servlet" method="post">
							<div class="form-group">
								<label>Email</label> <input type="email"
									class="form-control" name="email" placeholder="Enter Your Email ID">
							</div>
							<div class="form-group">
								<label>Password</label> <input type="password" class="form-control"
									name="psw" placeholder="Enter Your Password">
							</div>
							<button type="submit"
								class="btn btn-primary badge-pill btn-block">Login</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Footer Start -->
		<%@ include file="allContent/footer.jsp"%>
	<!-- Footer End -->

</body>
</html>

