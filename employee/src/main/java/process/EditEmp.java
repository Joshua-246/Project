package process;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import pojo.Employee;
@WebServlet("/edit")
public class EditEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id=Integer.parseInt(request.getParameter("empId"));
		String fname=request.getParameter("fName");
		String lname=request.getParameter("lName");
		String address=request.getParameter("add");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		int zip=Integer.parseInt(request.getParameter("zip"));
		String dept=request.getParameter("dept");
		
		Employee e = new Employee(id,fname,lname,address, state,country,zip,dept);
		
		int status = EmployeeDao.editEmployee(e);
		if(status == 1) {
			response.sendRedirect("viewEmp.jsp");
		}
		else{
			response.sendRedirect("error.jsp");
		}
	}
}
