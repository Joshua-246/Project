<%@page import="dao.ProductDao" %>
<%@page import="java.util.*" %>
<%@page import="java.lang.*" %>

<%
	System.out.println("recieved paar  " + request.getParameter("pId"));
	int id=Integer.parseInt(request.getParameter("pId"));
	int status = ProductDao.deleteProduct(id);
	if(status == 1) {
	response.sendRedirect("viewProducts.jsp");
	}
	else{
	response.sendRedirect("error.jsp");
	}
%>