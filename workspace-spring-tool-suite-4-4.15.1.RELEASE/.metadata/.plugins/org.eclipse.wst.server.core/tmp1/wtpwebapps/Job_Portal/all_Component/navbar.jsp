<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-custom">
	<a class="navbar-brand" href="index.jsp">Job Portal</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="index.jsp">Home
					<span class="sr-only">(current)</span>
			</a></li>
			<c:if test="${usrObj.role eq 'Admin' }">
				<li class="nav-item"><a class="nav-link" href="add_jobs.jsp">Post
						Job</a></li>
				<li class="nav-item"><a class="nav-link" href="view_jobs.jsp">View
						Job</a></li>
			</c:if>

		</ul>
		<form class="form-inline my-2 my-lg-0">
			<c:if test="${usrObj.role eq 'Admin' }">
				<a href="Register.jsp" class="btn btn-light mr-1"><i
					class="fas fa-user"></i> Admin</a>
					<a href="Logout" class="btn btn-light "><i
				class="fas fa-sign-in-alt"></i> Logout</a>
			</c:if>
			
			<c:if test="${usrObj.role eq 'User' }">
				<a href="Register.jsp" class="btn btn-light mr-1" data-toggle="modal" data-target="#exampleModal"><i
					class="fas fa-user"></i>${usrObj.name }</a>
				<a href="Logout" class="btn btn-light "><i
					class="fas fa-sign-in-alt"></i> Logout</a>
			</c:if>

			<c:if test="${empty usrObj}">
				<a href="Login.jsp" class="btn btn-light mr-1"><i
					class="fas fa-sign-in-alt"></i> Login</a>
				<a href="Register.jsp" class="btn btn-light"><i
					class="fas fa-user"></i> SingUp</a>
			</c:if>

		</form>
	</div>
</nav>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">User Profile</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        	<table>
        		<tbody>
        			<tr>
        				<th scope="row">Full Name :- </th>
        				<th>${usrObj.name }</th>
        			</tr>
        			<tr>
        				<th scope="row">Email ID :- </th>
        				<th>${usrObj.email }</th>
        			</tr>
        			<tr>
        				<th scope="row">Qualification :- </th>
        				<th>${usrObj.qualification }</th>
        			</tr>
        			<tr>
        				<th scope="row">Role :- </th>
        				<th>${usrObj.role }</th>
        			</tr>
        		</tbody>
        	</table>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <a href="Edit_profile.jsp" class="btn btn-primary text-white">Edit Profile</a>
      </div>
    </div>
  </div>
</div>