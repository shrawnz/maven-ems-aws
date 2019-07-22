<%@page import="com.wynk.maven.models.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees Info</title>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<form:form action="/maven-ems/updateEmployee" method="post">
		<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">Employee Details</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">Id:</th>
					<td><input type="text" name="id" value="${employee.getId()}" readonly/> </td>
				</tr>
				<tr>
					<th scope="row">Name:</th>
					<td><input type="text" name="name" value="${employee.getName()}" /></td>
				</tr>
				<tr>
					<th scope="row">Department:</th>
					<td><input type="text" name="department" value="${employee.getDepartment()}" /></td>
				</tr>
				<tr>
					<th scope="row">Email:</th>
					<td><input type="email" name="email" value="${employee.getEmail()}" /></td>
				</tr>
				<tr>
					<th></th>
					<th scope="col"><input type="submit" value="Edit" /></th>
				</tr>
			</tbody>
		</table>

	</form:form>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>