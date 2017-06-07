package com.bit.frame.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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
	
	public int searchID2(String userId){
		String sql = " SELECT userID FROM member_table " ;
		sql += " WHERE userId = ? " ;
		String retId = "" ;
		int ret = 0;
		try {
			PreparedStatement pSt = conn.prepareStatement(sql);
			pSt.setString(1, userId);
			ResultSet rs = pSt.executeQuery();
			
			// id가 이미 있으면
			while(rs.next()){
				retId = rs.getString(1); // userId 같은값이 추출
			}
			// 넘겨받은 userId와
			// select로 찾은 userId(retID)가 같은가 비교해서
			if(retId.equals(userId)) {
				ret = 1; // 같다
			} else {
				ret = 0; // 다르면
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret ;
		
	}
	
	public int searchID(String userID){
		String sql = " SELECT count(userId) FROM member_table " ;
			sql += " WHERE userId = ? " ;
			
		int ret = 0 ;
		try {
			PreparedStatement pSt = conn.prepareStatement(sql);
			pSt.setString(1, userID);
			ResultSet rs = pSt.executeQuery();
			// 해당 userID가 있으므로
			// rs.getInt(1) : 1을 넘겨준다
			rs.next();
			ret = rs.getInt(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	
	// 전체 회원리스트를 가져오기 위해서
	public Vector selectAll(){
		
		Vector data = new Vector();
		
		String sql = " SELECT * FROM member_table " ;
		PreparedStatement pSt;
		try {
			pSt = conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();
			while(rs.next()){
				// auto_increment
				Vector row = new Vector();
				row.add(rs.getInt("id"));
				row.add(rs.getString("userId"));
				row.add(rs.getString("userPw"));
				row.add(rs.getString("userName"));
				row.add(rs.getString("userSex"));
				row.add(rs.getString("userTel"));
				data.add(row);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
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
