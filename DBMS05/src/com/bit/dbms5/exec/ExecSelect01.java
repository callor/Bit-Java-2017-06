package com.bit.dbms5.exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecSelect01 {

	public static void main(String[] args) {

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			String sql = " SELECT * FROM student ";
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/bitdb?useSSL=false",
					"root",
					"!BitCom0228");
			PreparedStatement pSt = conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();
			
			while(rs.next()){
				System.out.print(rs.getString("stnum")+"\t");
				System.out.print(rs.getString("stname")+"\t");
				System.out.print(rs.getInt("stclass")+"\t");
				System.out.print(rs.getString("stmajor")+"\n");
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
