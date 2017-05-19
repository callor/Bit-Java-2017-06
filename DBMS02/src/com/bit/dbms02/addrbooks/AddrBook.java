package com.bit.dbms02.addrbooks;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.bit.dbms02.hello.DbConn;

public class AddrBook {

	public static void main(String[] args) {

		DbConn dbConn = new DbConn();
		PreparedStatement pSt = null;
		String insertSQL = " insert into addrbook values(?,?,?,?) ; " ;
		String selectSQL = " select * from addrbook " ;
		Scanner scanner = new Scanner(System.in);
		
		try {
			pSt = dbConn.conn.prepareStatement(insertSQL);
			while(true){
				
				System.out.print("이름>>");
				String strName = scanner.nextLine();
				if(strName.equals("END--")) break;
				
				System.out.print("전화번호>>");
				String strTel = scanner.nextLine();
				
				System.out.print("주소>>");
				String strAddr = scanner.nextLine();
				
				System.out.print("나이>>");
				String strAge = scanner.nextLine();
				
				pSt.setString(1, strName);
				pSt.setString(2, strTel);
				pSt.setString(3, strAddr);
				pSt.setString(4, strAge);
				pSt.executeUpdate();
				System.out.println("Query Send OK!!");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			pSt = dbConn.conn.prepareStatement(selectSQL);
			ResultSet rs = pSt.executeQuery();
			
			while(rs.next()){
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getInt(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}




