<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="pojo.Employee" %>
    <%@page import="dao.EmployeeDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Employee</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div align="center">
<h2>Employee Management System</h2>
<h3>Edit Employee</h3>
	<% int eid =Integer.parseInt(request.getParameter("eId"));
	Employee e = EmployeeDao.getEmployeeById(eid);
	%>
	<form action="edit" method="post">
		<table>
			<tr>
				<td>Employee ID:</td>
				<td><input type="text" value="<%=eid%>" name="empId" readonly="readonly"></td>
			</tr>
			<tr>
				<td>First Name:</td>
				<td><input type="text" value="<%=e.getFirstName() %>" name="fName"></td>
			</tr><tr>
				<td>Last NAme:</td>
				<td><input type="text" value="<%=e.getLastName() %>" name="lName"></td>
			</tr><tr>
				<td>Adress:</td>
				<td><input type="text" value="<%= e.getAddress() %>" name="add"></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><input type="text" value="<%= e.getState() %>" name="state"></td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><input type="text" value="<%= e.getCountry() %>" name="country"></td>
			</tr>
			<tr>
				<td>ZipCode:</td>
				<td><input type="text" value="<%= e.getZipcode() %>" name="zip"></td>
			</tr>
			<tr>
				<td>Department:</td>
				<td><input type="text" value="<%= e.getDepartment() %> %>" name="dept"></td>
			</tr>
			<tr>
			<td></td>
			<td align="center" ><input type="submit" value="Save" ></td> 
			<td></td>
		</tr>
		</table>
	</form>
	
</div>
</body>
</html>