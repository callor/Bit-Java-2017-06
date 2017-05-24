package com.bit.dbms5.exec;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.dbms5.dao.StudentDAO;

public class ExecSelct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO studentDAO = new StudentDAO(); // 객체 생성
		studentDAO.connect(); // 연결 실행
		
		ResultSet rs = studentDAO.getStudent();
		
		try {
			while(rs.next()){
				System.out.print(rs.getString("stnum") + "\t");
				System.out.print(rs.getString("stname") + "\t");
				System.out.print(rs.getString("stclass") + "\t");
				System.out.println(rs.getString("stmajor"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
