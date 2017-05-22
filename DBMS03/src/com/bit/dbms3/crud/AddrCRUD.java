package com.bit.dbms3.crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bit.dbms3.dbopen.DbConn;

public class AddrCRUD {
	
	public static void main(String[] args){
		
		DbConn dbConn = new DbConn();// db open, connection
		PreparedStatement pSt= null;
		
		String insertSQL = " Insert into ";
		insertSQL += " addrbook values " ;
		insertSQL += " (0,?,?,?,?) " ;
		
		try {
			pSt = dbConn.conn.prepareStatement(insertSQL);
			
			pSt.setString(1, "트럼프");
			pSt.setString(2, "100");
			pSt.setString(3, "미합중국");
			pSt.setInt(4, 60);
			pSt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
