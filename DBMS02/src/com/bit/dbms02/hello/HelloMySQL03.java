package com.bit.dbms02.hello;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloMySQL03 {

	public static void main(String[] args) {

		DbConn dbConn = new DbConn();
		
		PreparedStatement pSt = null;
		
		String sql = " SELECT * FROM addrbook WHERE age = ? ; " ;
		
		try {
			pSt = dbConn.conn.prepareStatement(sql);
			pSt.setInt(1, 16);
			ResultSet rs = pSt.executeQuery() ;
			
			while(rs.next()){
				System.out.print(rs.getString(1) + "\t"); // 이름
				System.out.print(rs.getString(2) + "\t"); // 전화번호
				System.out.print(rs.getString(3) + "\t"); // 주소
				System.out.println(rs.getInt(4)); // 나이
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
