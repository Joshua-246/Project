package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;
import pojo.Employee;

public class EmployeeDao {

	public static int  addEmployee(Employee emp) {
		int status = 0;
		String query = "INSERT INTO employee_data VALUES(?,?,?,?,?,?,?,?)";
		try {
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(1, emp.getEmpId());
		st.setString(2, emp.getFirstName());
		st.setString(3, emp.getLastName());
		st.setString(4, emp.getAddress());
		st.setString(5, emp.getState());
		st.setString(6, emp.getCountry());
		st.setInt(7, emp.getZipcode());
		st.setString(8, emp.getDepartment());
		
		status = st.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static List<Employee> getAllEmployee() {
		List<Employee> emps = new ArrayList<Employee>();
		
		String query = "SELECT * FROM employee_data";
		try {
		Connection conn = DBUtil.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			Employee emp = new Employee(rs.getInt("employee_id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("address"),rs.getString("state"),rs.getString("country"),rs.getInt("zipcode"),rs.getString("department"));
			emps.add(emp);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return emps;
	}
	
	public static Employee getEmployeeById(int id) {
		String query = "SELECT * FROM employee_data WHERE employeet_id = ?";
		Employee emp = null;
		try {
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = conn.prepareStatement(query);
		st.setInt(1, id);
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			emp = new Employee(rs.getInt("employee_id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("address"),rs.getString("state"),rs.getString("country"),rs.getInt("zipcode"),rs.getString("department"));
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	public static int  editEmployee(Employee emp) {
		int status = 0;
		String query = "UPDATE employee_data SET first_name=?, last_name=?, addressstate=?, country=?, zipcode=?, department=? WHERE employee_id=?";
		try {
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = conn.prepareStatement(query);
		st.setString(1, emp.getFirstName());
		st.setString(2, emp.getLastName());
		st.setString(3, emp.getAddress());
		st.setString(4, emp.getState());
		st.setString(5, emp.getCountry());
		st.setInt(6, emp.getZipcode());
		st.setString(7, emp.getDepartment());
		
		status = st.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public static int deleteEmployee(int id) {
		int status =0;
		String query = "DELETE FROM product_data WHERE product_id = ?";
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
