package com.bit.maven02.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.maven02.dto.WordDTO;

public class WordDAO {
	
	List<WordDTO> dtos = new ArrayList<WordDTO>();
	Connection conn = null;
	PreparedStatement pSt = null;
	
	public WordDAO(){
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/bitdb?useSSL=false",
					"root",
					"!BitCom0228" );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void txt2DB(){
		
		String filename = "src/main/java/com/bit/maven02/doc/word.txt";
		FileReader fileReader;
		try {
			fileReader = new FileReader(filename);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String sql = " INSERT INTO words (word,means) " 
					+ " values(?,? )" ;
			
			pSt = conn.prepareStatement(sql);
			String reader = new String();
			while(true){
				reader = buffer.readLine();
				if(reader == null) break;
				
				String[] word = reader.split(":");
				pSt.setString(1, word[0]);
				pSt.setString(2, word[1]);
				pSt.executeUpdate();
			}
			buffer.close();
			System.out.println("단어장을 업로드 했습니다.");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public WordDTO getWord(){
		
		String countSQL = " SELECT count(*) FROM words ";
		String getSQL = " SELECT * FROM words WHERE id = ? ";
		WordDTO dto = null;
		try {
			pSt = conn.prepareStatement(countSQL);
			ResultSet rs = pSt.executeQuery();
			rs.next();
			int recCount = rs.getInt(1);
			
			// rec ID를 램덤으로 생성
			int getId = (int)(Math.random()*recCount+1);
			
			pSt = conn.prepareStatement(getSQL);
			pSt.setInt(1, getId); 
			rs = pSt.executeQuery();
			rs.next();
			dto = new WordDTO();
			dto.setWord(rs.getString("word"));
			dto.setMeans(rs.getString("means"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public List<WordDTO> getWords(){
		// 단어 4개를 추출해서 List에 담기
		for(int i = 0 ; i < 4 ; i++){
			WordDTO dto = this.getWord();
			dtos.add(dto);
		}
		return dtos;
	}
	
}
