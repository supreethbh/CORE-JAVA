package com.dxc.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class InsertQuery {

	public static void main(String[] args) {
		
		Connection con = null;
		           con = Properties.getDBConnection();
		 
		PreparedStatement prepState = null;
		   		 
		try {
			
			String insertQuery = " INSERT INTO PRODUCT (productID, productName, productPrice, productdate) "
							   + " VALUES (?, ?, ?, CURRENT_TIMESTAMP) ";

			prepState = con.prepareStatement(insertQuery);

			prepState.setInt(1, Integer.parseInt(args[0]));

			prepState.setString(2, args[1]);

			prepState.setDouble(3, Double.parseDouble(args[2]));
			
			int result = prepState.executeUpdate();
			
			if (result != 0) {
				
        		System.out.println("Query OK, " + result + " row affected");
            	System.out.println("Data has been successfully Inserted.........");
			}
				
		} catch (SQLException e) {

			e.printStackTrace();
			
		} finally {
			
			try {
				
				if(con != null) {
					con.close();
				}
				
				if(prepState != null) {
					prepState.close();
				}
				
			} catch (SQLException e2) {
				
				e2.printStackTrace();
			}
		}
	}
}
