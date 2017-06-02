package com.bit.frame.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bit.frame.model.MemberDTO;

public class MemberDAO {
	
	Connection conn = null;
	PreparedStatement pSt = null;
	public MemberDAO(){
		try {
			// 드라이버 로딩
			Class.forName("org.gjt.mm.mysql.Driver");
			
			// 연결 설정
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/bitdb?useSSL=false",
					"root",
					"!BitCom0228" );
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// CRUD 중 insert(creat)
	public int insert(MemberDTO dto){
		
		int ret = 0 ;
		String sql = " INSERT INTO member_table "
				+ " ( userid, username, userpw, usersex, usertel ) "
				+ " values( ?,?, md5(?),?,?); ";
		
		try {
			pSt = conn.prepareStatement(sql);
			pSt.setString(1, dto.getUserId());
			pSt.setString(2, dto.getUserName());
			pSt.setString(3, dto.getUserPw());
			pSt.setString(4, dto.getUserSex());
			pSt.setString(5, dto.getUserTel());
			
			ret = pSt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // sql을 서버에 전송해주고
		
		return ret ;
	}
}
