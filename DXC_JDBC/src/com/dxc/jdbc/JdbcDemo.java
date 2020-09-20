package com.dxc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		Connection con = null;
		Statement state = null;
		ResultSet result = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc", "root", "data");
			
			state = con.createStatement();
			
			result = state.executeQuery("SELECT * FROM PRODUCT");
			
			int count = 0;
			while (result.next()) {
				
				System.out.println(result.getInt(1) + "  " + result.getString(2) + "  " 
				                 + result.getDouble(3)+"  "+result.getDate("productDate"));
				++count;
			}
			
			System.out.println("\n" + count + " rows in a set");
			
		} catch (Exception e) {
			System.out.println(e);
			
		} finally {
			
    		try {
	
    			if(con != null) {
    				con.close();
    			}
	
    			if(state != null) {
    				state.close();
    			}
	
    			if(result != null) {
    				result.close();
    			}
	
    		} catch (SQLException e2) {
	
    			e2.printStackTrace();
    		}
		}
	}
}
