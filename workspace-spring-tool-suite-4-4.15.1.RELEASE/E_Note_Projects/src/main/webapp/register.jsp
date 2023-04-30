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
			<div class="col-md-4 col-sm-8 offset-2 offset-md-4">
				<div class="card mt-3">
					<div class="card-header text-center text-white bg-custom">
						<i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
						<h4>Registeration</h4>
					</div>
					<%
					String regMag = (String) session.getAttribute("regis_suces");
					if (regMag != null) {
					%>
					<div class="alert alert-success" role="alert" style="margin-bottom: 0px;">
						<%=regMag%>
						Login <a href="login.jsp">Click Here</a>
					</div>
					<%
						session.removeAttribute("regis_suces");
					}
					%>
					
					<%
					String failMag = (String) session.getAttribute("regis_fail");
					if (failMag != null) {
					%>
					<div class="alert alert-danger" role="alert" style="margin-bottom: 0px;">
						<%=failMag%>
					</div>
					<%
						session.removeAttribute("regis_fail");
					}
					%>
					
					<div class="card-body">
						<form action="register" method="post" style="margin-top: -14px;">
							<label>Full Name</label>
							<div class="form-group">
								<input type="text" name="name" class="form-control"
									placeholder="Enter Your Full Name" required>
							</div>
							<div class="form-group">
								<label>Email</label> <input type="email" class="form-control"
									name="email" placeholder="Enter Your Email ID" required>
							</div>
							<div class="form-group">
								<label>Phone No</label> <input type="text" class="form-control"
									name="phone" placeholder="Enter Your Mobile Number" required>
							</div>
							<div class="form-group">
								<label>Password</label> <input type="password"
									class="form-control" name="password"
									placeholder="Enter your Password" required>
							</div>
							<div class="form-check mb-2">
								<input type="checkbox" class="form-check-input" name="check" required>
								<label class="form-check-label">Agree Terms and
									Condition</label>
							</div>
							<button type="submit"
								class="btn btn-primary badge-pill btn-block">Register</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Footer Start -->
	<div>
		<%@ include file="allContent/footer.jsp"%>
	</div>
	<!-- Footer End -->

</body>
</html>