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
	<form action="searchResult.jsp">
		Enter Product ID:<input type="text" name="pId">
		<input type="submit" value="Search">
	</form>
</div>

</body>
</html>