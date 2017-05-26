package com.bit.dbms8.dbcon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bit.dbms8.config.DbConn;

public class BuyerCon {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pSt = null;
		
		String namesFile = "src/com/bit/dbms8/doc/names.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(namesFile);
			buffer = new BufferedReader(fileReader);
			
			Class.forName(DbConn.DB_Driver);
			System.out.println(DbConn.Msg.Msg_Driver_Success);
			conn = DriverManager.getConnection(
					DbConn.DB_URL,
					DbConn.DB_User,
					DbConn.DB_PASSWD);
			System.out.println(DbConn.Msg.Msg_Conn_Success);
			
			/*
				id int NOT NULL auto_increment,
				bucode varchar(10) NOT NULL , -- 고객코드
				buname varchar(15) NOT NULL, -- 고객이름
				butel varchar(15) NOT NULL, -- 전화번호
				buaddr varchar(50) DEFAULT "우리동네", -- 주소
				bupoint int DEFAULT 0, -- 포인트
				PRIMARY KEY(id)
			 */
			
			String sql = " INSERT INTO buyer(bucode,buname,butel) " 
					+ " values(?,?,?) ; " ;
			
			String reader = new String();
			
			while(true){
				reader = buffer.readLine();
				if(reader == null) break ;
				String[] names = reader.split(":");
												// (종료-시작)+시작
				int intTel_E = (int)(Math.random()*(9999-1000)+1000);
				int intTel_F = (int)(Math.random()*(9999-1000)+1000);
				
				String strTel = "010-" 
						+ Integer.toString(intTel_F) + "-" 
						+ Integer.toString(intTel_E) ;
				
				String strCode = Integer.toString(intTel_E);
				
				pSt = conn.prepareStatement(sql);
				pSt.setString(1, strCode);
				pSt.setString(2, names[0]);
				pSt.setString(3,strTel);
				pSt.executeUpdate();
				
			}
			System.out.println(DbConn.Msg.Msg_DbInsert_Sucess);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
