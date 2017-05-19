package com.bit.dbms02.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloMySQL {

	public static void main(String[] args) {

		try {
			//1. mysql-connection을 강제 import
			//   객체의 동적생성
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("MySQL Driver Loading Sucess!!");
			
			//2. DB 인증하고 접속
			// DB 인증하기 위해 필요한 정보
			//		어떤 DB에 연결할 것인가 : 경로정보
			//		사용자 ID
			//		비밀번호

			// 접속하기 위한 정보 변수 선언
			String url = "jdbc:mysql://localhost/bitdb?useSSL=false";
			String user = "root";
			String passwd = "!BitCom0228";
			
			// 반드시 java.sql.Connection 를 import 해야 한다.
			Connection conn = null;
			
			conn = DriverManager.getConnection(url,user,passwd);
			System.out.println("DB Connection Sucess");
			
			Statement st = null ;
			st = conn.createStatement(); // 쿼리를 날리기 위한 준비
			
			
			String _sql = " insert into addrbook values('최순실','002','소주도 독하군',30) ; " ;
			
			// 문자열을 바로 쿼리로 보내는 방법
			st.execute(_sql);

			_sql = " insert into addrbook values('박모씨','002','웃기기도 잘하군 더웃면 100번지',65) ; " ;
			
			System.out.println("쿼리 OK");
			st.execute(_sql);
			
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
