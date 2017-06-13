package com.bit.bm.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.bm.model.MemberDTO;

public class MemberDAO {

	Connection conn;
	PreparedStatement pSt;

	public MemberDAO() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bitdb?useSSL=false", "root", "!BitCom0228");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int loginCheck(String userId) {
		String sql = " SELECT count(*) FROM member_table WHERE  userId = ? ";
		int recCount = 0;
		try {
			pSt = conn.prepareStatement(sql);
			pSt.setString(1, userId);
			ResultSet rs = pSt.executeQuery();
			rs.next();
			recCount = rs.getInt(1); // 0이거나, 최고 1이상 ? > 0, ? == 0

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recCount;
	}

	// 매개변수가 다르면 method를 중복 정의 할 수 있다.
	public MemberDTO loginCheck(String userId, String userPasswd) {
		String sql = " SELECT * FROM member_table WHERE  userId = ? and userPasswd = md5(?) ";
		MemberDTO dto = null; // = new MemberDTO();
		try {
			pSt = conn.prepareStatement(sql);
			pSt.setString(1, userId);
			pSt.setString(2, userPasswd);
			ResultSet rs = pSt.executeQuery();
			
			if (rs.next()) {
				dto = new MemberDTO();
				dto.id = rs.getInt("id");
				dto.userId = rs.getString("userId");
				dto.userName = rs.getString("userName");
				dto.userPasswd = rs.getString("userPasswd");
				dto.userTel = rs.getString("userTel");
				dto.userGrade = rs.getInt("userGrade");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}

}
