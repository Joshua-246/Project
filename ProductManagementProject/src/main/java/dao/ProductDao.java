package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;
import pojo.ProductInfo;

public class ProductDao {

	public static int  addProduct(ProductInfo product) {
		int status = 0;
		String query = "INSERT INTO product_data VALUES(?,?,?,?)";
		try {
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(1, product.getProducdtId());
		st.setString(2, product.getProductName());
		st.setString(3, product.getProductCategory());
		st.setInt(4, product.getProductPrice());
		status = st.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static List<ProductInfo> getAllProducts() {
		List<ProductInfo> products = new ArrayList<ProductInfo>();
		
		String query = "SELECT * FROM product_data";
		try {
		Connection conn = DBUtil.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			ProductInfo product = new ProductInfo(rs.getInt("product_id"),rs.getString("product_name"),rs.getString("product_category"),rs.getInt("product_price"));
			products.add(product);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	public static ProductInfo getProductById(int pid) {
		String query = "SELECT * FROM product_data WHERE product_id = ?";
		ProductInfo product = null;
		try {
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(1, pid);
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			product = new ProductInfo(rs.getInt("product_id"),rs.getString("product_name"),rs.getString("product_category"),rs.getInt("product_price"));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	public static int  updateProduct(ProductInfo prod) {
		int status = 0;
		String query = "UPDATE product_data SET product_name=?, product_category=?, product_price=? WHERE product_id=?";
		try {
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(4, prod.getProducdtId());
		st.setString(1, prod.getProductName());
		st.setString(2, prod.getProductCategory());
		st.setInt(3, prod.getProductPrice());
		status = st.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static int deleteProduct(int id) {
		int status =0;
		String query = "DELETE FROM product_data WHERE product_id = ?";
		ProductInfo product = null;
		try {
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(1, id);
		status = st.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
