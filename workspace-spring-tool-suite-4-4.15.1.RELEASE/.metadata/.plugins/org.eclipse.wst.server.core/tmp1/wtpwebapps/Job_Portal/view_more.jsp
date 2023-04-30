<%@page import="java.util.ArrayList"%>
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
<title>View More Page</title>
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
				<%
				String loc = request.getParameter("loc");
				String cat = request.getParameter("cat");
				String msg = "";

				Job_DAO dao = new Job_DAO(DB_Connection.getConn());
				List<Jobs> list = null;
				if ("lo".equals(loc) && "ca".equals(cat)) {
					list = new ArrayList<Jobs>();
					msg = "Job Not Available";
				} else if ("lo".equals(loc) || "ca".equals(cat)) {
					list = dao.getJob_locationORCat(loc, cat);
				} else {
					list = dao.getJob_locationOAndCat(loc, cat);
				}

				if (list.isEmpty()) {
				%>
				<h4 class="text-center text-danger">Job Not Available</h4>
				<%
				}

				if (list != null) {
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
							<%=j.getPdate().toString()%></h6>
						<div class="text-center">
							<a href="single_post.jsp?id=<%=j.getId()%>"
								class="btn btn-sm bg-success text-white">View More</a>
						</div>
					</div>
				</div>
				<%
				}
				} else {
				%>
				<h4 class="text-center text-danger"><%=msg%></h4>
				<%
				}
				%>



			</div>
		</div>
	</div>

	<%@include file="all_Component/footer.jsp"%>
</body>
</html>