package com.bit.dbms3.crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.bit.dbms3.dbopen.DbConn;

public class AddrDelete {
	
	public void delete(int id){
		DbConn dbConn = new DbConn();
		String deleteSQL = " DELETE FROM addrbook where id=? ";
		
		try {
			System.out.println("데이터를 삭제할까요?(YES/no)");
			
//			Scanner scanner = new Scanner(System.in);
//			String keyin = scanner.nextLine();
//			if(keyin.equals("YES")) {
//				
//			}
			if((new Scanner(System.in)).nextLine().equals("YES")){
				PreparedStatement pSt = dbConn.conn.prepareStatement(deleteSQL);
				pSt.setInt(1, id);
				pSt.executeUpdate();
				System.out.println("데이터를 삭제 합니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
