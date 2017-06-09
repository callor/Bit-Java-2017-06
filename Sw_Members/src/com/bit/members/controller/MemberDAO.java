package com.bit.members.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.bit.members.dto.MemberDTO;

public class MemberDAO {

	Connection conn;
	PreparedStatement pSt;

	public MemberDAO() {
		try {
			Class.forName(Db_Info.DB_DRIVER);
			conn = DriverManager.getConnection(Db_Info.DB_PATH, Db_Info.DB_USER, Db_Info.DB_PASSWD);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// } catch (IOException e) {

		}
	}

	public MemberDTO selectByid(int id){
		String sql =  " SELECT * FROM member_table WHERE id = ?" ;
		MemberDTO dto = new MemberDTO();
		try {
			pSt = conn.prepareStatement(sql);
			pSt.setInt(1, id);
			ResultSet rs = pSt.executeQuery();
//			while(rs.next()){
			rs.next();
			
			dto.setId(rs.getInt("id"));
			dto.setUserID(rs.getString("userID"));
			dto.setUserName(rs.getString("userName"));
			dto.setUserPasswd(rs.getString("userPw"));
			dto.setUserSex(rs.getString("userSex"));
			dto.setUserTel(rs.getString("userTel"));
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}
	
	public int update(MemberDTO dto){
		int rec = 0;
		String sql = " UPDATE SET " ;
		sql += " userid = ?, ";
		sql += " username = ?, ";
		sql += " usersex = ?, ";
		sql += " usertel = ? ";
		sql += " WHERE id = ?" ;
		
		try {
			pSt = conn.prepareStatement(sql);
			pSt.setString(1, dto.getUserID());
			pSt.setString(2, dto.getUserName());
			pSt.setString(3, dto.getUserSex());
			pSt.setString(4, dto.getUserTel());
			
			pSt.setInt(5, dto.getId());
			
			rec = pSt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return rec;
	}

	// Vector를 리턴해주도록 선언
	public Vector selectAll() {
		// method 아래에 변수 선언
		Vector dbList = new Vector(); // 1차원 배열이 일단 생성
		String sql = " SELECT * FROM member_table ";
		try {
			pSt = conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();

			while (rs.next()) {
				Vector d = new Vector();
				d.add(rs.getInt("id")); // int형
				d.add(rs.getString("userID")); // String
				d.add(rs.getString("userName"));
				d.add(rs.getString("userPw"));
				d.add(rs.getString("userSex"));
				d.add(rs.getString("userTel"));

				// dbList 1차원 배열(백터)에 또하나의 배열을 추가
				dbList.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// dbList를 호출한 곳으로 보내준다.
		return dbList;

	}

	public int insert(MemberDTO dto) {
		int ret = 0;
		String sql = " INSERT INTO member_table ";
		sql += " ( userId,userPw,userName ) ";
		sql += " values ( ?,?,? ) ";

		try {
			pSt = conn.prepareStatement(sql);
			pSt.setString(1, dto.getUserID());
			pSt.setString(2, dto.getUserPasswd());
			pSt.setString(3, dto.getUserName());

			ret = pSt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

	public void db2String() {

		String[] strArray = new String[10]; // 문자열 배열 10개

		// 배열 안에 배열을 포함하는 구조
		// 2차원 배열
		String[][] strArray2 = new String[][] { { "홍길동", "서울", "02" }, { "이몽룡", "남원", "042" } };

	}

	// 상수클래스 선언
	// 전체 프로젝트에서 공통으로 사용할 문자열
	static class Db_Info {
		static public final String DB_DRIVER = "org.gjt.mm.mysql.Driver";
		static public String DB_PATH = "jdbc:mysql://localhost/bitdb?useSSL=false";
		static public String DB_USER = "root";
		static public String DB_PASSWD = "!BitCom0228";
	}

}
