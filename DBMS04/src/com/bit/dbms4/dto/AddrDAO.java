package com.bit.dbms4.dto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.dbinterface.CRUD;

public class AddrDAO implements CRUD {

	private AddrDTO dto = new AddrDTO();
	private List<AddrDTO> dtos = new ArrayList<AddrDTO>();
	
	DbConn dbConn = new DbConn();
	
	@Override
	public void select() {
		// TODO Auto-generated method stub

		PreparedStatement pSt = null;
		String sql = " SELECT * FROM addrbook ";
		try {
			pSt = dbConn.conn.prepareStatement(sql);
			ResultSet rs = pSt.executeQuery();
			while(rs.next()){
				
				dto = new AddrDTO();
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				dto.setTel(rs.getString("tel"));
				dto.setAge(rs.getInt("age"));
				dtos.add(dto);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void select(int id) {

		PreparedStatement pSt = null;
		String sql = " SELECT * FROM addrbook WHERE id = ? ";
		try {
			pSt = dbConn.conn.prepareStatement(sql);
			pSt.setInt(1, id);
			ResultSet rs = pSt.executeQuery();
			while(rs.next()){
				
				dto = new AddrDTO();
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				dto.setTel(rs.getString("tel"));
				dto.setAge(rs.getInt("age"));
				dtos.add(dto);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void select(String name) {

		PreparedStatement pSt = null;
		String sql = " SELECT * FROM addrbook WHERE name = ? ";
		try {
			pSt = dbConn.conn.prepareStatement(sql);
			pSt.setString(1, name);
			ResultSet rs = pSt.executeQuery();
			while(rs.next()){
				
				dto = new AddrDTO();
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				dto.setTel(rs.getString("tel"));
				dto.setAge(rs.getInt("age"));
				dtos.add(dto);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<AddrDTO> getAddrDTO(){
		return dtos;
	}
	
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
