package com.bit.dbms5.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.dbms5.dto.StudentDTO;

public class StudentDAO {

	Connection conn = null; // 연결객체
	PreparedStatement pSt = null; // 쿼리객체
	
	String url = "jdbc:mysql://localhost/bitdb?useSSL=false";
	String user = "root";
	String passwd = "!BitCom0228";
	
	// DB 접속
	public void connect(){
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("MySQL Driver Loading Sucess!!");
			
			// 연결객체를 생성
			conn = DriverManager.getConnection(url,user,passwd);
			System.out.println("Db 연결 성공");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet getStudent(){
		String sql = " SELECT * FROM STUDENT " ;
		ResultSet rs = null;
		try {
			pSt = conn.prepareStatement(sql); // 쿼리를 서버에 전송
			rs = pSt.executeQuery(); // 쿼리를 실행하고
				// 결과값을 rs에 받는다.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void setStudent(String stnum, 
			String stname, 
			int stclass, 
			String stmajor){
		
		String sql = " INSERT INTO student VALUES(0,?,?,?,?) " ;
		try {

			pSt = conn.prepareStatement(sql);
			pSt.setString(1, stnum);
			pSt.setString(2, stname);
			pSt.setInt(3, stclass);
			pSt.setString(4, stmajor);
			pSt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setStudent(StudentDTO dto){
		
		String sql = " INSERT INTO student VALUES(0,?,?,?,?) " ;
		try {

			pSt = conn.prepareStatement(sql);
			pSt.setString(1, dto.stnum);
			pSt.setString(2, dto.stname);
			pSt.setInt(3, dto.stclass);
			pSt.setString(4, dto.stmajor);
			pSt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
