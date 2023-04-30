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
<title>View Jobs Page</title>
<%@include file="all_Component/all_css.jsp"%>
</head>
<body>
	<c:if test="${usrObj.role ne 'Admin' }">
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
				<c:if test="${not empty adjfMsg }">
					<div class="alert alert-success text-center" role="alert">${adjfMsg}</div>
					<c:remove var="adjfMsg" scope="session" />
				</c:if>

				<!-- delete -->
				<c:if test="${not empty adjdMsg }">
					<div class="alert alert-success text-center" role="alert">${adjdMsg}</div>
					<c:remove var="adjdMsg" scope="session" />
				</c:if>
				<%
				Job_DAO jdo = new Job_DAO(DB_Connection.getConn());
				List<Jobs> list = jdo.getAllJobs();
				for (Jobs j : list) {
				%>
				<div class="card mt-2 mb-2">
					<div class="card-body">
						<div class="text-center text-primary">
							<i class="fas fa-clipboard fa-2x"></i>
						</div>
						<h6><%=j.getTitle()%></h6>
						<p><%=j.getDescription()%></p>
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
							<%=j.getPdate()%></h6>
						<div class="text-center">
							<a href="Edit_job.jsp?id=<%=j.getId()%>"
								class="btn btn-sm bg-success text-white">Edit</a> <a
								href="del_job_post?id=<%=j.getId()%>"
								class="btn btn-sm bg-danger text-white">Delete</a>
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