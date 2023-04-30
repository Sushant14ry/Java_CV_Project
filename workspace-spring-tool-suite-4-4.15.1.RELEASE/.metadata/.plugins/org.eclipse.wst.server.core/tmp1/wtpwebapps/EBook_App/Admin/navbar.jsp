<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<div class="container-fluid" style="height: 12px; background: #303f9f">

</div>
<div class="container-fluid p-3 bg-light">
	<div class="row">
		<div class="col-md-3 col-sm-3 mt-2 text-success">
			<h3>
				<i class="fas fa-home"></i> EBooks
			</h3>
		</div>
		<div class="col-md-6 col-sm-6">
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-primary my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>

		<div class="col-md-3 col-sm-3 ">
			<c:if test="${not empty userObj }">
				<a href="Login.jsp" class="btn btn-success mb-1"><i
					class="fas fa-user-plus"></i> ${userObj.name}</a>
				<a class="btn btn-primary mb-1" data-toggle="modal"
					data-target="#exampleModal"><i class="fas fa-sign-in-alt"></i>
					Logout</a>
			</c:if>
			<c:if test="${empty userObj }">
				<a href="../Login.jsp" class="btn btn-success mb-1"><i
					class="fas fa-sign-in-alt"></i> Login</a>
				<a href="../Register.jsp" class="btn btn-primary text-white"><i
					class="fas fa-user-plus"></i> Register</a>
			</c:if>
		</div>
	</div>
</div>

<!-- Logout Modal Section  -->

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel"></h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<div class="text-center">
					<h4 class="mb-4">Are You Sure Do you Want to Logout</h4>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<a href="../Logout" class="btn btn-primary text-white">Logout</a>
				</div>
			</div>
		</div>
	</div>
</div>


<nav class="navbar navbar-expand-lg navbar-dark bg_custom">
	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="Homes.jsp"><i
					class="fas fa-home"></i> Home <span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="addBooks.jsp"><i class="fas fa-book-open"></i> Add Book</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="allBooks.jsp"><i class="fas fa-book-open"></i> All Book</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="orderBooks.jsp"><i class="fas fa-book-open"></i> Order
					Book</a></li>
			</li>
		</ul>
		<button class="btn btn-light my-2 my-sm-0">
			<i class="fas fa-cog"></i> Setting
		</button>
		<button class="btn btn-light my-2 my-sm-0 ml-1">
			<i class="fas fa-phone"></i> Contact Us
		</button>
	</div>
</nav>