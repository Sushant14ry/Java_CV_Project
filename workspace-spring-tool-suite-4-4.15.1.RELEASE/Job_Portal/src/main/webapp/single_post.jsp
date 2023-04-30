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
<title>Single Post Page</title>
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
				<h5 class="text-center text-primary mt-2">View Job</h5>
				<!-- update -->
				<c:if test="${not empty adjuMsg }">
					<div class="alert alert-success text-center" role="alert">${adjuMsg}</div>
					<c:remove var="adjuMsg" scope="session" />
				</c:if>

				<%
				int jobpstId = Integer.parseInt(request.getParameter("id"));
				Job_DAO jdo = new Job_DAO(DB_Connection.getConn());
				Jobs j = jdo.getJobById(jobpstId);
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
							<%=j.getPdate().toString()%></h6>
						<div class="text-center">
							<a href="view_more.jsp?id=<%=j.getId()%>"
								class="btn btn-sm bg-success text-white">View More</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="all_Component/footer.jsp"%>
</body>
</html>