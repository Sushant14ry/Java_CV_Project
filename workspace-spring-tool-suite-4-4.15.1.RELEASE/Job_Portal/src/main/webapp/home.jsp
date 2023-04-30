<%@page import="com.entity.Jobs"%>
<%@page import="java.util.List"%>
<%@page import="com.DB.DB_Connection"%>
<%@page import="com.DAO.Job_DAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<%@include file="all_Component/all_css.jsp"%>
</head>
<body>
	<c:if test="${empty usrObj }">
		<c:redirect url="Login.jsp" />
	</c:if>
	<%@include file="all_Component/navbar.jsp"%>

	<div class="container ">
		<div class="row">
			<div class="col-md-10 offset-md-1">
				<h5 class="text-center text-primary">All Jobs</h5>
				<!-- update -->
				<c:if test="${not empty adjuMsg }">
					<div class="alert alert-success text-center" role="alert">${adjuMsg}</div>
					<c:remove var="adjuMsg" scope="session" />
				</c:if>

				<div class="card mt-2">
					<div class="card-body">
						<form action="view_more.jsp" method="get">
							<div class="row">
								<div class="col-md-5">
									<h5>Location</h5>
									<div class="form-group">
										<select name="loc" class="custom-select">
											<option value="ca" selected>Choose Location.......</option>
											<option value="Kathmandu">Kathmandu</option>
											<option value="Hetauda">Hetauda</option>
											<option value="Pokhara">Pokhara</option>
											<option value="Birgunj">Birgunj</option>
											<option value="Janakput">Janakput</option>
										</select>
									</div>
								</div>
								<div class="col-md-5">
									<h5>Category</h5>
									<div class="form-group">
										<select name="cat" class="custom-select">
											<option value="ca" selected>Choose Category......</option>
											<option value="IT">IT</option>
											<option value="Devloper">Devloper</option>
											<option value="Banking">Banking</option>
											<option value="Engineer">Engineer</option>
											<option value="Teacher">Teacher</option>
										</select>
									</div>
								</div>
								<div class="col-md-2">
									<h5></h5>
									<button type="submit" class="btn btn-primary mt-4">Search
										Job</button>
								</div>
							</div>
						</form>
					</div>
				</div>
				<%
				Job_DAO jdo = new Job_DAO(DB_Connection.getConn());
				List<Jobs> list = jdo.getAllActiveJobsForUsers();
				for (Jobs j : list) {
				%>
				<div class="card mt-2 mb-2">
					<div class="card-body">
						<div class="text-center text-primary">
							<i class="fas fa-clipboard fa-2x"></i>
						</div>
						<h6><%=j.getTitle()%></h6>
						<%
							if(j.getDescription().length() > 0 && j.getDescription().length() < 120)
							{
							%>
								<p><%=j.getDescription()%></p>
							<%	
							}else
							{
							%>
								<p><%=j.getDescription().substring(0,120) %>....</p>
							<%
							}
						%>
						<div class="form-row">
							<div class="form-group col-md-3">
								<input type="text" class="form-control form-control-sm"
									value="<%=j.getLocation()%>" readonly>
							</div>
							<div class="form-group col-md-3">
								<input type="text" class="form-control form-control-sm"
									value="<%=j.getCategory()%>" readonly>
							</div>
							<div class="form-group col-md-3">
								<input type="text" class="form-control form-control-sm"
									value="<%=j.getStatus()%>" readonly>
							</div>
						</div>
						<h6>
							Publish Date :
							<%=j.getPdate().toString()%></h6>
						<div class="text-center">
							<a href="single_post.jsp?id=<%=j.getId()%>"
								class="btn btn-sm bg-success text-white">View More</a> 
						</div>
					</div>
				</div>
				<%
				}
				%>

			</div>
		</div>
	</div>

	<%@include file="all_Component/footer.jsp"%>
</body>
</html>