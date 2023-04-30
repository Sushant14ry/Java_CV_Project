<%@page import="com.Entity.Cart"%>
<%@page import="java.util.List"%>
<%@page import="com.Entity.User"%>
<%@page import="com.DB.DB_Connect"%>
<%@page import="com.DAO.Cart_DAO_impl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="allcomponent/allCss.jsp"%>
</head>
<body>
	<%@include file="allcomponent/navbar.jsp"%>

	<c:if test="${empty userObj}">
		<c:redirect url="Login.jsp" />
	</c:if>

	<c:if test="${ not empty csucMsg }">
		<div class="alert alert-success text-center" role="alert">${csucMsg }</div>
		<c:remove var="csucMsg" scope="session" />
	</c:if>

	<c:if test="${ not empty cfailMsg }">
		<div class="alert alert-danger text-center" role="alert">${cfailMsg }</div>
		<c:remove var="cfailMsg" scope="session" />
	</c:if>

	<!-- Check Out Or Order Message -->
	<c:if test="${ not empty pyMsg }">
		<div class="alert alert-danger text-center" role="alert">${pyMsg }</div>
		<c:remove var="pyMsg" scope="session" />
	</c:if>
	
	<c:if test="${ not empty nlcrtMsg }">
		<div class="alert alert-danger text-center" role="alert">${nlcrtMsg }</div>
		<c:remove var="nlcrtMsg" scope="session" />
	</c:if>
	
	<div class="container">
		<div class="row p-2">
			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-success">Your Selected Item</h3>
						<table class="table table-striped">
							<thead>
								<tr>
									<th scope="col">Book Name</th>
									<th scope="col">Book Author</th>
									<th scope="col">Price</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<%
								User u = (User) session.getAttribute("userObj");

								Cart_DAO_impl dao = new Cart_DAO_impl(DB_Connect.getConnect());
								List<Cart> cartlist = dao.getBookByUser(u.getId());
								double total_price = 0.00;
								for (Cart c : cartlist) {
									total_price = c.getToal_price();
								%>
								<tr>
									<th><%=c.getBook_name()%></th>
									<td><%=c.getBook_author()%></td>
									<td><%=c.getBook_price()%></td>
									<td><a
										href="remove_book?cbid=<%=c.getBook_id()%>&&uid=<%=c.getUser_id()%>&&cid=<%=c.getCart_id()%>"
										class="btn btn-sm btn-danger">Remove</a></td>
								</tr>
								<%
								}
								%>
								<tr>
									<td></td>
									<td><b>Total Price : </b></td>
									<td><%=total_price%></td>
									<td></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-success">Your Details for Order</h3>
						<form action="order" method="post">
							<input type="hidden" value="${userObj.id }" name="id">
							<div class="form-row">
								<div class="form-group col-md-6">
									<label>Name</label> <input type="text" value="<%=u.getName()%>"
										readonly name="name" class="form-control"
										placeholder="Full Name">
								</div>
								<div class="form-group col-md-6">
									<label>Email</label> <input type="email"
										value="<%=u.getEmail()%>" readonly name="email"
										class="form-control" placeholder="Email">
								</div>
								<div class="form-group col-md-6">
									<label>Phone</label> <input type="text"
										value="<%=u.getPhone()%>" readonly name="phone"
										class="form-control" placeholder="Phone Number">
								</div>
								<div class="form-group col-md-6">
									<label>Address</label> <input type="text" name="address"
										class="form-control" placeholder="Address" required>
								</div>
								<div class="form-group col-md-6">
									<label>Landmark</label> <input type="text" name="landmark"
										class="form-control" placeholder="Landmark" required>
								</div>
								<div class="form-group col-md-6">
									<label>City</label> <input type="text" name="city"
										class="form-control" placeholder="City" required> 
								</div>
								<div class="form-group col-md-6">
									<label>State</label> <input type="text" name="state"
										class="form-control" placeholder="State" required>
								</div>
								<div class="form-group col-md-6">
									<label>Zip Code</label> <input type="text" name="pincode"
										class="form-control" placeholder="Zip" required>
								</div>
								<div class="form-group form-control">
									<label>Payment Method</label> <select class="form-control"
										name="payment">
										<option value="noSelect">---- Select Option ---</option>
										<option value="COD">Cash On Delivery</option>
										<option value="esewa">ESewa</option>
									</select>
								</div>
								<div class="text-center">
									<button type="submit" class="btn btn-warning text-white">Order
										Now</button>
									<a href="" class="btn btn-success">Continue Shopping</a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>