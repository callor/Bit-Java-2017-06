package com.bit.dbms3.crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bit.dbms3.dbopen.DbConn;

public class AddrSelect {

//	public static void main(String[] args) {
	
	// List 보기용
	public void listView(){
		// TODO Auto-generated method stub
		
		DbConn dbConn = new DbConn();
		PreparedStatement pSt = null;
		
		String selectSQL = " Select * from addrbook ";
		try {
			pSt= dbConn.conn.prepareStatement(selectSQL);
			// select 한 list를 받기
			ResultSet rs = pSt.executeQuery();
			
			System.out.print("ID \t");
			System.out.print("이름    \t");
			System.out.print("전화번호\t");
			System.out.print("주소           \t");
			System.out.print("나이\n");
			
			System.out.print("===\t");
			System.out.print("==========\t");
			System.out.print("==========\t");
			System.out.print("=================\t");
			System.out.print("==\n");
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t\t");
				System.out.print(rs.getString(3)+"\t\t");
				System.out.print(rs.getString(4)+"\t\t");
				System.out.print(rs.getInt(5)+"\n");
				
			}
			System.out.print("---\t");
			System.out.print("----------\t");
			System.out.print("----------\t");
			System.out.print("----------------\t");
			System.out.print("---\n");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
