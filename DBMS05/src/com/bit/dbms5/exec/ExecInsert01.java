package com.bit.dbms5.exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExecInsert01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			String sql = " INSERT INTO STUDENT Values(0,?,?,?,?) "; 
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/bitdb?useSSL=false",
					"root",
					"!BitCom0228");
			PreparedStatement pSt = conn.prepareStatement(sql);
			Scanner scanner = new Scanner(System.in);
			while(true){
				
				System.out.print("학번(END--:종료)>>");
				String strTemp = scanner.nextLine();
				if(strTemp.equals("END--")) break;
				
				pSt.setString(1, strTemp);
				
				System.out.print("이름>>");
				strTemp = scanner.nextLine();
				pSt.setString(2, strTemp);
				
				System.out.print("학년>>");
				strTemp = scanner.nextLine();
				pSt.setInt(3,Integer.valueOf(strTemp));
				
				System.out.print("전공>>");
				strTemp = scanner.nextLine();
				pSt.setString(4, strTemp);
				pSt.executeUpdate();
				
			}
			System.out.println("추가 완료");
//			ResultSet rs = pSt.executeQuery();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
