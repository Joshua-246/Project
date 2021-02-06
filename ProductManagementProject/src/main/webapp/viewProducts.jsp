<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="dao.ProductDao" %>
    <%@page import="pojo.ProductInfo" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Products</title>
</head>
<body>
<%@ include file = "header.jsp" %>

<div align="center">
<h2>Product Management System</h2>
<h3>View Products</h3>
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
	<%
		List<ProductInfo> products=ProductDao.getAllProducts();
		for(ProductInfo pro : products) {
	%>
		<tr>
			<td><%=pro.getProducdtId() %></td>
			<td><%=pro.getProductName()%></td>
			<td><%=pro.getProductCategory() %></td>
			<td><%=pro.getProductPrice()%></td>
			<td><button onclick="location.href='editProduct.jsp?pId=<%=pro.getProducdtId()%>';">Edit</button></td>
			<td><button onclick="location.href='deleteProduct.jsp?pId=<%=pro.getProducdtId()%>';">Delete</button></td>
		</tr>
		<%
		}
		%>
</table>
</div>
</body>
</html>