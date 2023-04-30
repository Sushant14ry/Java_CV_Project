<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<div class="container-fluid" style="height: 12px; background: #303f9f">

</div>
<div class="container-fluid p-3 bg-light">
	<div class="row">
		<div class="col-md-3 col-sm-3 mt-2 text-success">
			<h3>
				<a href="index.jsp" style="text-decoration: none;" class="text-success"><i class="fas fa-home"></i> EBooks</a>
			</h3>
		</div>
		<div class="col-md-6 col-sm-6">
			<form class="form-inline my-2 my-lg-0" action="Search_Book.jsp" method="post">
				<input class="form-control mr-sm-2" type="search Books" name="srch_char"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-primary my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
		<c:if test="${not empty userObj }">
			<div class="col-md-3 col-sm-3 ">
				<a href="CheckOut.jsp"><i class="fas fa-cart-plus fa-2x"></i></a>
				<a href="Home.jsp" class="btn btn-success mb-1"><i
					class="fas fa-user-plus"></i> ${userObj.name}</a> <a
					href="Logout" class="btn btn-primary text-white"> <i
					class="fas fa-sign-in-alt"></i> Logout
				</a>
			</div>
		</c:if>
		<c:if test="${empty userObj }">
			<div class="col-md-3 col-sm-3 ">
				<a href="Login.jsp" class="btn btn-success mb-1"><i
					class="fas fa-sign-in-alt"></i> Login</a> <a href="Register.jsp"
					class="btn btn-primary text-white"><i class="fas fa-user-plus"></i>
					Register</a>
			</div>
		</c:if>
	</div>
</div>
<nav class="navbar navbar-expand-lg navbar-dark bg_custom">
	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp"><i
					class="fas fa-home"></i> Home <span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="All_recentBooks.jsp"><i class="fas fa-book-open"></i>
					Recent Book</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="All_newBooks.jsp"><i class="fas fa-book-open"></i> New
					Book</a></li>
			<li class="nav-item active"><a class="nav-link"
				href="All_oldBooks.jsp"><i class="fas fa-book-open"></i> Old
					Book</a></li>
			</li>
		</ul>
		<a href="Setting.jsp" class="btn btn-light my-2 my-sm-0">
			<i class="fas fa-cog"></i> Setting
		</a>
		<a href="" class="btn btn-light my-2 my-sm-0 ml-1">
			<i class="fas fa-phone"></i> Contact Us
		</a>
	</div>
</nav>