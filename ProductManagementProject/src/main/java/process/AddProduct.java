package process;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ProductDao;
import pojo.ProductInfo;
@WebServlet("/addprod")
public class AddProduct extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int productId = Integer.parseInt(request.getParameter("prodId"));
		String productName = request.getParameter("prodName");
		String productCategory = request.getParameter("prodCategory");
		int productPrice = Integer.parseInt(request.getParameter("prodPrice"));
		
		ProductInfo product = new ProductInfo(productId,productName,productCategory,productPrice);
		int status= ProductDao.addProduct(product);
		if(status ==1) {
				response.sendRedirect("viewProducts.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}
		
	}
}
