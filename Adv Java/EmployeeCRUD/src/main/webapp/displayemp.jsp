<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees</title>
</head>
<body>
	<table border="2">
		<thead>
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Sal</th>
				<th>actions</th>
			</tr>
		<tbody>
			<c:forEach var="emp" items="${list}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.sal}</td>
				<td><a href="#">Edit</a> / <a href="#">Delete</a></td>
			</tr>
			</c:forEach>
		</tbody>	
	</table>
</body>
</html>