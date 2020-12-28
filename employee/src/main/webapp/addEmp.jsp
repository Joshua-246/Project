<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Emp</title>
</head>
<body>
<%@ include file = "header.jsp" %>

<div align="center">
<h2>Employeet Management System</h2>
<h3>Add Employee</h3>
	<form action="addemp" >
		<table>
			<tr>
				<td>Employee ID:</td>
				<td><input type="text" name="empId"></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="fName"></td>
			</tr><tr>
				<td>Last NAme:</td>
				<td><input type="text" name="lName"></td>
			</tr><tr>
				<td>Adress:</td>
				<td><input type="text" name="add"></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><input type="text" name="stste"></td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><input type="text" name="country"></td>
			</tr>
			<tr>
				<td>Zipcode:</td>
				<td><input type="text" name="zip"></td>
			</tr>
			<tr>
				<td><label for="dep">Department:</label></td>
				<td><select name="dept" id="dept">
			  <option value="Accounting">Accounting</option>
			  <option value="Logistics">Logistics</option>
			  <option value="Technical">Technical</option> </select></td>
			</tr>
			<tr>
			<td></td>
			<td align="center" ><input type="submit" value="Add Employee" ></td> 
			<td></td>
		</tr>
		</table>
	</form>
</div>
</body>
</html>