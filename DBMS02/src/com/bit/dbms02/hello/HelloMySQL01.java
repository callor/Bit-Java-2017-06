package com.bit.dbms02.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HelloMySQL01 {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("MySQL Driver Loading Success!!");
			
			String url = "jdbc:mysql://localhost/bitdb?useSSL=false";
			String user = "root";
			String passwd = "!BitCom0228";

			Connection conn = DriverManager.getConnection(url,user,passwd);
			
			PreparedStatement pSt = null;
							// name, 	tel, 	addr, 	age
							// varchar	varchar	varchar int
			String _sql = " insert into addrbook values(?,?,?,?) ; ";
			
			// SQL을 사전 컴파일한다.
			pSt = conn.prepareStatement(_sql);
			
			pSt.setString(1, "성춘향");
			pSt.setString(2, "009");
			pSt.setString(3, "남원시");
			pSt.setInt(4, 16);
			pSt.executeUpdate();
			
			pSt.setString(1, "장영실");
			pSt.setString(2, "012");
			pSt.setString(3, "서울");
			pSt.setInt(4, 20);
			pSt.executeUpdate();

			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
