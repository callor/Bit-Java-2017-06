package com.bit.dbms6.exec;

import java.util.ArrayList;
import java.util.List;

import com.bit.dbms6.dao.StudentDAO;
import com.bit.dbms6.dto.StudentDTO;

public class ExecInsert {

	public static void main(String[] args) {

		List<StudentDTO> dtos = new ArrayList<StudentDTO>();
		StudentDAO dao = new StudentDAO();
		dao.connect();
		
		for(int i = 0 ; i < 10 ; i++){
			StudentDTO dto = new StudentDTO();
			dto.setId(0);
			dto.setStNum(Integer.toString(i+1));
			
			int t = (int)(Math.random()*100-50+50);
			dto.setStName(Integer.toString(t));
			
			dto.setStClass(1);
			dto.setStMajor("국문학과");
			
			dtos.add(dto);
		}
		System.out.println(dtos.toString());
		dao.setStudentDTO(dtos);
		dao.insert();
		
		System.out.println("추가 완료");
		
		
	}

}
