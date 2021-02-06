<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<%@ include file = "header.jsp" %>

<div align="center">
<h2>Product Management System</h2>
<h3>Add Product</h3>
	<form action="addprod" >
		<table>
			<tr>
				<td>Enter Product ID:</td>
				<td><input type="text" name="prodId"></td>
			</tr>
			<tr>
				<td>Enter Product Name:</td>
				<td><input type="text" name="prodName"></td>
			</tr><tr>
				<td>Enter Product Category:</td>
				<td><input type="text" name="prodCategory"></td>
			</tr><tr>
				<td>Enter Product Price:</td>
				<td><input type="text" name="prodPrice"></td>
			</tr>
			<tr>
			<td></td>
			<td align="center" ><input type="submit" value="Add Product" ></td> 
			<td></td>
		</tr>
		</table>
	</form>
</div>
</body>
</html>