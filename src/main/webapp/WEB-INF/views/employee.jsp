<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees Info</title>
</head>
<body>
<%@include  file="navbar.jsp" %>
<form action="/maven-ems/addEmployee" method="get">
	<input type="submit" class="btn btn-primary" value="Add new employees">
</form>
    <table class="table table-hover">
        <thead>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Email</th>
                <th scope="col">Actions</th>
            </tr>
        </thead>
        <tbody>
    			<c:forEach items="${employees}" var="employee">
       		<tr>
    			<td scope="col">${employee.getId()}</td>
    			<td scope="col">${employee.getName()}</td>
    			<td scope="col">${employee.getDepartment()}</td>
    			<td scope="col">${employee.getEmail()}</td>
    			<td><form action="/maven-ems/editEmployee/${employee.getId()}" method="get">
    			<input type="submit" value="Edit" /> </form>
    			<form action="/maven-ems/deleteEmployee/${employee.getId()}" method="post">
    			<input type="submit" value="Delete" /> </form>
    			</td>
    			</tr>
       			
			</c:forEach>
        </tbody>
    </table>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>