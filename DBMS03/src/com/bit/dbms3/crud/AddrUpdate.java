package com.bit.dbms3.crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.bit.dbms3.dbopen.DbConn;
import com.bit.dbms3.vo.AddrVO;

public class AddrUpdate {
	
	DbConn dbConn = new DbConn();
	PreparedStatement pSt = null;
	
	public void update(int id){

		
		String selectSQL = " SELECT * FROM addrbook WHERE id=?" ;

		Scanner scanner = new Scanner(System.in);
		
		try {
			pSt = dbConn.conn.prepareStatement(selectSQL);
			pSt.setInt(1, id);
			ResultSet rs = pSt.executeQuery();
			AddrVO vo = new AddrVO();
			vo.setId(id);
			while(rs.next()){
				System.out.print(rs.getString(2)+">>");
				vo.setName(scanner.nextLine());
				
				System.out.print(rs.getString(3)+">>");
				vo.setTel(scanner.nextLine());
				
				System.out.print(rs.getString(4)+">>");
				vo.setAddr(scanner.nextLine());
				
				System.out.print(rs.getInt(5)+">>");
				vo.setAge(Integer.valueOf(scanner.nextLine()));
				
				updateExec(vo);
			}
			

			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	private void updateExec(AddrVO vo){
		
		String updateSQL = " UPDATE addrbook " ;
		updateSQL += " SET name = ?, tel = ?, ";
		updateSQL += " addr= ?, age=? " ;
		updateSQL += " WHERE id=?" ;
		
		try {
			pSt = dbConn.conn.prepareStatement(updateSQL);
			pSt.setString(1, vo.getName());
			pSt.setString(2, vo.getTel());
			pSt.setString(3, vo.getAddr());
			pSt.setInt(4, vo.getAge());
			pSt.setInt(5, vo.getId());
			pSt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
