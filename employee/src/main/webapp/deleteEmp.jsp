<%@page import="dao.EmployeeDao" %>
<%@page import="java.util.*" %>
<%@page import="java.lang.*" %>

<%
	int id=Integer.parseInt(request.getParameter("eId"));
	int status = EmployeeDao.deleteEmployee(id);
	if(status == 1) {
	response.sendRedirect("viewEmp.jsp");
	}
	else{
	response.sendRedirect("error.jsp");
	}
%>