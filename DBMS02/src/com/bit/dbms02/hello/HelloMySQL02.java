package com.bit.dbms02.hello;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloMySQL02 {

	public static void main(String[] args) {

		// DbConnection을 수행
		DbConn dbConn = new DbConn();
		
		PreparedStatement pSt = null;
		
		String sql = " insert into addrbook values(?,?,?,?) ;";
		
		try {
			pSt = dbConn.conn.prepareStatement(sql);
			
			pSt.setString(1, "트럼프");
			pSt.setString(2, "100");
			pSt.setString(3, "미합중국");
			pSt.setInt(4, 55);
			pSt.executeUpdate();
			System.out.println("Query Send Sucess!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
