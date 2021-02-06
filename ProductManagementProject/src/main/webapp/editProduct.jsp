<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="pojo.ProductInfo" %>
    <%@page import="dao.ProductDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Product</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div align="center">
<h2>Product Management System</h2>
<h3>Edit Product</h3>
	<% int pid =Integer.parseInt(request.getParameter("pId"));
		ProductInfo p = ProductDao.getProductById(pid);
	%>
	<form action="edit" method="post">
		<table>
			<tr>
				<td>Product ID:</td>
				<td><input type="text" value="<%=pid%>" name="prodId" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Product Name:</td>
				<td><input type="text" value="<%=p.getProductName() %>" name="prodName"></td>
			</tr><tr>
				<td>Product Category:</td>
				<td><input type="text" value="<%=p.getProductCategory() %>" name="prodCategory"></td>
			</tr><tr>
				<td>Product Price:</td>
				<td><input type="text" value="<%= p.getProductPrice() %>" name="prodPrice"></td>
			</tr>
			<tr>
			<td></td>
			<td align="center" ><input type="submit" value="Save Changes" ></td> 
			<td></td>
		</tr>
		</table>
	</form>
	
</div>
</body>
</html>