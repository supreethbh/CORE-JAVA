package com.dxc.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {

	public static void main(String[] args) {
		
		Connection con = null;
        con = Properties.getDBConnection();

        PreparedStatement prepState = null;
		 
        try {
	
        	String deletetQuery = " DELETE FROM PRODUCT "
					            + " WHERE productID = ? ";

        	prepState = con.prepareStatement(deletetQuery);

        	prepState.setInt(1, Integer.parseInt(args[0]));
	
        	int result = prepState.executeUpdate();
        	
        	if (result != 0) {
				
        		System.out.println("Query OK, " + result + " row affected");
            	System.out.println("Data has been successfully Deleted.........");
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
