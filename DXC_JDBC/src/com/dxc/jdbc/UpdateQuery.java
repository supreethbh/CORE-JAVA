package com.dxc.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateQuery {

	public static void main(String[] args) {
	
		Connection con = null;
				   con = Properties.getDBConnection();
		
		PreparedStatement pstm = null;
				   
		String updateQuery = " UPDATE PRODUCT "
				           + " SET productName = ? , productPrice = ? , productDate = CURRENT_TIMESTAMP "
				           + " WHERE productID = ? ";
		
		try {
			
			pstm = con.prepareStatement(updateQuery);
			
			pstm.setString(1, args[0]);
			pstm.setDouble(2, Double.parseDouble(args[1]));
			pstm.setInt(3, Integer.parseInt(args[2]));
			
			int result = pstm.executeUpdate();
			
			if (result != 0) {
				
        		System.out.println("Query OK, " + result + " row affected");
            	System.out.println("Data has been successfully Updated.........");
			}
				
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				if(con != null) {
					con.close();
				}
				
				if(pstm != null) {
					pstm.close();
				}
				
			} catch (SQLException e2) {
				
				e2.printStackTrace();
			}
		}
	}
}
