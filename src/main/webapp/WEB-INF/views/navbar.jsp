<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<form class="form-inline" action="SuccessServlet" method="get">
		<a class="navbar-brand" href="./SuccessServlet?home=home">Home</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		
		<% if(session.getAttribute("username")!=null) {  %>  
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="#">Profile</a></li>
					<li class="nav-item active"><a class="nav-link"
						href="#">Employee</a></li>
				</ul>
			</div>
			</form>
			<div class="collapse navbar-collapse"></div>
			<form class="form-inline" action="./logout" method="POST">
				<ul class="navbar-nav">
					<li class="nav-item active">
						<input type="submit" name="logoutButton" value="Logout"/>
					</li>
				</ul>
			</form>
		<% } else { %>
			<div class="collapse navbar-collapse"></div>
				<ul class="navbar-nav">
					<li class="nav-item active"><a class="nav-link" href="./login">Login</a></li>
				</ul>
		<% }%>
</nav>