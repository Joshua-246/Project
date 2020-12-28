<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="dao.EmployeeDao" %>
    <%@page import="pojo.Employee" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employee</title>
</head>
<body>
<%@ include file = "header.jsp" %>

<div align="center">
<h2>Product Management System</h2>
<h3>View Employee</h3>
	<table>
		<thead>
			<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Adress</th>
			<th>State</th>
			<th>Country</th>
			<th>ZipCode</th>
			<th>Department</th>
			<th colspan="2" >Action</th>
		</tr>
	</thead>
	<%
		List<Employee> employees=EmployeeDao.getAllEmployee();
		for(Employee emp : employees) {
	%>
		<tr>
			<td><%=emp.getEmpId() %></td>
			<td><%=emp.getFirstName()%></td>
			<td><%=emp.getLastName() %></td>
			<td><%=emp.getAddress()%></td>
			<td><%=emp.getState()%></td>
			<td><%=emp.getCountry()%></td>
			<td><%=emp.getZipcode()%></td>
			<td><%=emp.getDepartment()%></td>
			<td><button onclick="location.href='editEmp.jsp?eId=<%=emp.getEmpId()%>';">Edit</button></td>
			
			
			<td><button onclick="location.href='deleteEmp.jsp?eId=<%=emp.getEmpId()%>';">Delete</button></td>
		</tr>
		<%
		}
		%>
</table>
</div>
</body>
</html>