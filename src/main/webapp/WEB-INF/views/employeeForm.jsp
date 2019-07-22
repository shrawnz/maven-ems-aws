<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<title>EMS</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4 mt-4">
				<h3>Add New Employee</h3>
				<form action="./addEmployee" method="POST">
					<div class="form-group">
						<input type="text" class="form-control" name="name" placeholder="Name"
							value="" />
							<font color="red"><form:errors path="name"></form:errors></font>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="department" placeholder="Department"
							value="" />
							<font color="red"><form:errors path="department"></form:errors></font>
					</div>
					<div class="form-group">
						<input type="email" class="form-control" name="email" placeholder="Email"
							value="" />
							<font color="red"><form:errors path="email"></form:errors></font>
					</div>
		
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Add" />
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>