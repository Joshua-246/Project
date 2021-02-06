package process;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import pojo.ProductInfo;
@WebServlet("/edit")
public class EditProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id=Integer.parseInt(request.getParameter("prodId"));
		String name=request.getParameter("prodName");
		String category=request.getParameter("prodCategory");
		int price=Integer.parseInt(request.getParameter("prodPrice"));
		
		ProductInfo prod = new ProductInfo(id,name,category,price);
		
		int status = ProductDao.updateProduct(prod);
		if(status == 1) {
			response.sendRedirect("viewProducts.jsp");
		}
		else{
			response.sendRedirect("error.jsp");
		}
	}
}
