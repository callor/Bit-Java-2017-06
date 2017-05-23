package com.bit.dbms4.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

	private String URL = "jdbc:mysql://localhost/bitdb?useSSL=false";
	private String user = "root";
	private String passwd = "!BitCom0228";

	public Connection conn = null;
	
	public DbConn(){
//	}
	
//	public void connect(){
		try {
			
//			com.mysql.Driver : 구버전 mysql 
//			oracle.jdbc.driver.OraclDriver : 오라클 DB
			Class.forName("org.gjt.mm.mysql.Driver"); // 부품을 메모리로 올리기
			System.out.println("Driver Loading Success!!");
			
			conn = DriverManager.getConnection(URL,user,passwd); // DB 접속하기
			
			System.out.println("Connection Suceess!!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
