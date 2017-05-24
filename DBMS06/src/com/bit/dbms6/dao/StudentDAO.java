package com.bit.dbms6.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.dbms6.dto.StudentDTO;

public class StudentDAO implements CRUD {

	private List<StudentDTO> studentDTOs = new ArrayList<StudentDTO>();
//	ArrayList<StudentDTO> dtos = new ArrayList<StudentDTO>();
	
	private Connection conn = null ;
	private PreparedStatement pSt = null;
	private String url = "jdbc:mysql://localhost/bitdb?useSSL=false";
	private String user = "root";
	private String passwd = "!BitCom0228";

	public void connect(){
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection(url,user,passwd);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<StudentDTO> getStudentDTOs() {
		return studentDTOs;
	}

	public void setStudentDTO(List<StudentDTO> studentDTOs) {
		this.studentDTOs = studentDTOs;
	}

	@Override
	public void select() {

		String sql = " SELECT * FROM STUDENT ";
		try {
			pSt = conn.prepareStatement(sql);
			StudentDTO dto = null;
			
			ResultSet rs = pSt.executeQuery();
			while(rs.next()){
				// 1라인 data를 dto 에 할당
				dto = new StudentDTO();
				dto.setId(rs.getInt("id"));
				dto.setStNum(rs.getString("stnum"));
				dto.setStName(rs.getString("stname"));
				dto.setStClass(rs.getInt("stclass"));
				dto.setStMajor(rs.getString("stmajor"));
				
				// dto를 List에 추가
				studentDTOs.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void select(int id) {

	}

	@Override
	public void insert() {
		
		String sql = " INSERT INTO student values(0,?,?,?,?) " ;
		try {
			pSt = conn.prepareStatement(sql);
			for(StudentDTO d : studentDTOs){
				
				pSt.setString(1, d.getStNum());
				pSt.setString(2, d.getStName());
				pSt.setInt(3, d.getStClass());
				pSt.setString(4, d.getStMajor());
				pSt.executeUpdate();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
