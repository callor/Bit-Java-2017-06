package com.bit.dbms8.dbcon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bit.dbms8.config.DbConn;

public class NamesCon {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pSt = null;
		
		String namesFile = "src/com/bit/dbms8/doc/names.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			// names 파일을 읽기 위한 준비
			fileReader = new FileReader(namesFile);
			buffer = new BufferedReader(fileReader);
			
			// DB 연결을 위한 준비
			Class.forName(DbConn.DB_Driver);
			System.out.println(DbConn.Msg.Msg_Conn_Success);
			
			conn = DriverManager.getConnection(
					DbConn.DB_URL,
					DbConn.DB_User,
					DbConn.DB_PASSWD
					);
			
			String reader = new String();
			// 1 egname, 2 hgname 3 means
			String sql = " INSERT INTO names values(0,?,?,?); " ;
			pSt = conn.prepareStatement(sql); // sql을 서버로 전송
			
			while(true){
				reader = buffer.readLine(); // 파일에서 한줄씩 읽기
				if(reader == null) break;
				// 0:영문이름, 1:한글발음, 2:의미
				String[] names = reader.split(":");
				pSt.setString(1, names[0]);
				pSt.setString(2, names[1]);
				pSt.setString(3, names[2]);
				
				pSt.executeUpdate();
				
			}
			buffer.close();
			fileReader.close();
			
			System.out.println(DbConn.Msg.Msg_DbInsert_Sucess);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
