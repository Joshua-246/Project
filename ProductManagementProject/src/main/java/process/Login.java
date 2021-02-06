package process;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDao;
import pojo.LoginInfo;

@WebServlet("/path")
public class Login extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		
		

		if(LoginDao.isUserValid( new LoginInfo(username,password))) {
			HttpSession session = request.getSession();
			session.setAttribute("uname", username);
			session.setMaxInactiveInterval(400);
			response.sendRedirect("home.jsp");
		}
		else {
			response.sendRedirect("loginfailed.jsp");
		}
	}

}
