package com.dxc.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) {
		
		Connection con = null;
        		   con = Properties.getDBConnection();

        Statement state = null;
        ResultSet result = null;
		 
        try {
	
        	state = con.createStatement();
	
        	String excecuteQuery = " SELECT * FROM PRODUCT ";

        	result = state.executeQuery(excecuteQuery);
	
        	int count = 0;
        	
        	while (result.next()) {

        		int productID = result.getInt("productID");

        		String productName = result.getString("productName");

        		double productPrice = result.getDouble("productPrice");

        		Date productdate = result.getDate("productdate");
		
        		System.out.println(productID + "  " + productName + "  " + productPrice + "  " + productdate);
        		
        		++count;
        	}
        	
        	System.out.println("\n" + count + " rows in a set");

        } catch (SQLException e) {

        	e.printStackTrace();
	
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
