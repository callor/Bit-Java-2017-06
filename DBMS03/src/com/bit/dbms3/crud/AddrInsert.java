package com.bit.dbms3.crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bit.dbms3.dbopen.DbConn;
import com.bit.dbms3.vo.AddrVO;

public class AddrInsert {

	ArrayList<AddrVO> addrs = new ArrayList<AddrVO>();
	public void insert(){
		
		// 키보드에서 입력받아 List에 등록
		Scanner scanner = new Scanner(System.in);
		while(true){
			AddrVO vo = new AddrVO();
			System.out.print("이름>>");
			vo.setName(scanner.nextLine());
			if(vo.getName().equals("END--")) break;
			
			System.out.print("전화번호>>");
			vo.setTel(scanner.nextLine());
			
			System.out.print("주소>>");
			vo.setAddr(scanner.nextLine());
			
			System.out.print("나이>>");
			vo.setAge(Integer.valueOf(scanner.nextLine()));
			
			addrs.add(vo);
			
		}
		
		DbConn dbConn = new DbConn();
		String insertSQL = " insert into addrbook " ;
		insertSQL +=  " values(0,?,?,?,?) ";
		
		try {
			PreparedStatement pSt = dbConn.conn.prepareStatement(insertSQL);
			
			for(AddrVO v : addrs){
				pSt.setString(1, v.getName());
				pSt.setString(2, v.getTel());
				pSt.setString(3, v.getAddr());
				pSt.setInt(4, v.getAge());
				
				pSt.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DB 등록이 완료되었습니다");
		
		
		
	}
	
}
