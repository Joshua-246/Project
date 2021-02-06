<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="dao.ProductDao" %>
    <%@page import="pojo.ProductInfo" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Product</title>
</head>
<body>
<%@ include file = "header.jsp" %>

<div align="center">
<h2>Product Management System</h2>
<h3>Search Product</h3>
</div>

<div align="center">
	<table>
		<thead>
			<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Category</th>
			<th>Price</th>
			<th colspan="2" >Action</th>
		</tr>
	</thead>
	<% int id = Integer.parseInt(request.getParameter("pId"));
		ProductInfo pro = ProductDao.getProductById(id);

	%>
		<tr>
			<td><%=pro.getProducdtId() %></td>
			<td><%=pro.getProductName()%></td>
			<td><%=pro.getProductCategory() %></td>
			<td><%=pro.getProductPrice()%></td>
			<td><button onclick="location.href='editProduct.jsp?pId=<%=pro.getProducdtId()%>';">Edit</button></td>
			<td><button onclick="location.href='deleteProduct.jsp?pId=<%=pro.getProducdtId()%>';">Delete</button></td>
		</tr>

</table>
</div>

</body>
</html>