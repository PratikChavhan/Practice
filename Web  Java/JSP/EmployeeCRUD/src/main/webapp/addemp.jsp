<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<div>
		<form action="addnewemp" method="post">
			EmployeeID: <input type="text" name="empid" id="empid" /><br />
			EmployeeName: <input type="text" name="ename" id="ename" /><br />
			EmployeeSal: <input type="text" name="sal" id="sal" /><br />
			<button type="submit" name="btn" id="btn">Submit</button>
		</form>
	</div>
</body>
</html>