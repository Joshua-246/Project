package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbutil.DBUtil;
import pojo.LoginInfo;

public class LoginDao {
	 
	public static boolean isUserValid(LoginInfo user) {
		boolean validStatus = false;
		String query = "SELECT * FROM login_data WHERE username ='" + user.getUsername() +"' AND password ='" + user.getPassword() +"'"; 
		try {
		Connection conn= DBUtil.getConnection();
		Statement st= conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			validStatus=true;
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return validStatus;
	}
}
