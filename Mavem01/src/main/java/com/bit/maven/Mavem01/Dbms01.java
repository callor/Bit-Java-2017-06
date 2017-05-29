package com.bit.maven.Mavem01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.maven.Mavem01.dbconfig.DbConfig;

public class Dbms01 {

	public static void main(String[] args) {

		try {
			Class.forName(DbConfig.DB_Driver);
			Connection conn = DriverManager.getConnection(
					DbConfig.DB_Url,
					DbConfig.DB_User,
					DbConfig.DB_Passwd );
			
			String sql = " SELECT * FROM buyer Limit 10 " ;
			PreparedStatement pSt = conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();
			/*
			id int NOT NULL auto_increment,
			bucode varchar(10) NOT NULL , -- 고객코드
			buname varchar(15) NOT NULL, -- 고객이름
			butel varchar(15) NOT NULL, -- 전화번호
			buaddr varchar(50) DEFAULT "우리동네", -- 주소
			bupoint int DEFAULT 0, -- 포인트
			*/
			while(rs.next()){
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getString("bucode")+"\t");
				System.out.print(rs.getString("buname")+"\t");
				System.out.print(rs.getString("butel")+"\t");
				System.out.print(rs.getString("buaddr")+"\n");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
