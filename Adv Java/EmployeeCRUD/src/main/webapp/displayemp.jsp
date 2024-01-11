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
				<th>Employee Salary</th>
				<th>actions</th>
			</tr>
		<tbody>
			<c:forEach var="emp" items="${list}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.sal}</td>
				<td><a href="editemp?eid={emp.empno}">Edit</a> / 
				<a href="deleteemp?eid={emp.empno}">Delete</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<p><a href="addemp.jsp">Add New Employee</a></p>
</body>
</html>