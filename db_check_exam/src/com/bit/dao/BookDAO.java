package com.bit.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.dto.BookDTO;

public class BookDAO {
	
	Connection conn;
	PreparedStatement pSt ;

	public BookDAO(){
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/bitdb?useSSL=false",
					"root",
					"!BitCom0228"
					);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// create : insert
	// 	dto를 받아서 insert 실행하고
	// 	insert된 레코드 개수를 return
	public int insert(BookDTO dto) {
		int rec = 0 ;
		String sql = " INSERT INTO book_table ";
		sql += " (bookCode, bookTitle,bookGenre,bookComp,bookPrice) " ;
		sql += " VALUSE( ?,?,?,?,? ) ";
		try {
			pSt = conn.prepareStatement(sql);
			pSt.setString(1, dto.getBookCode());
			pSt.setString(2,dto.getBookTitle());
			pSt.setString(3,dto.getBookGenre());
			pSt.setString(4, dto.getBookComp());
			pSt.setInt(5,dto.getBookPrice());
			
			// insert할때 오류가 나면 0, -1
			// 정상이면 insert한 레코드 개수
			rec = pSt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rec ;
	}
	
	// read : select
	// 	ArrayList<DTO> 만들고
	//  select를 한다음
	//  ResultSet에서 받고
	//  ResultSet을 while로 순환하면서
	//  dto를 만들고
	//  dto에 ResultSet를 한 레코드씩 복사하고
	//  ArrayList<DTO> dtos에서 add하고
	//  dtos 리턴한다.
	public ArrayList<BookDTO> selectAll(){
		ArrayList<BookDTO> dtos = new ArrayList<BookDTO>();
		String sql = " SELECT * FROM book_table " ;
		try {
			pSt = conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();
			
			while(rs.next()){
				BookDTO dto = new BookDTO();
				dto.setId(rs.getInt("id"));
				dto.setBookCode(rs.getString("bookCode"));
				dto.setBookTitle(rs.getString("bookTitle"));
				dto.setBookGenre(rs.getString("bookGenre"));
				dto.setBookComp(rs.getString("bookComp"));
				dto.setBookPrice(rs.getInt("bookPrice"));
				
				dtos.add(dto);
	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos ;
	}
	
	// update
	// dto를 받고
	// update 하고
	// update된 레코드 개수를 return
	public int update(BookDTO dto){
		int rec = 0 ;
		String sql = " UPDATE book_table SET ";
		sql += " bookCode = ?,";
		sql += " bookTitle = ?,";
		sql += " bookGenre = ?, ";
		sql += " bookComp = ?,";
		sql += " bookPrice = ? " ;
		sql += " WHERE id = ? ";
		
		try {
			pSt = conn.prepareStatement(sql);
			pSt.setString(1, dto.getBookCode());
			pSt.setString(2, dto.getBookTitle());
			pSt.setString(3, dto.getBookGenre());
			pSt.setString(4, dto.getBookComp());
			pSt.setInt(5, dto.getId());
			rec = pSt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rec;
	}
	
	// delete
	// id 값을 받고,
	// delete를 수행하고
	// 수행결과 개수를 return
	public int delete(int id){
		int rec = 0 ;
		String sql = " DELETE FROM book_table WHERE id = ? " ;
		try {
			pSt = conn.prepareStatement(sql);
			rec = pSt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rec ;
	}
}
