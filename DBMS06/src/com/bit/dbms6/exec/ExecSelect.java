package com.bit.dbms6.exec;

import java.util.List;

import com.bit.dbms6.dao.StudentDAO;
import com.bit.dbms6.dto.StudentDTO;

public class ExecSelect {

	public static void main(String[] args) {

		StudentDAO dao = new StudentDAO();
		
		dao.connect(); // DB 연결해서 query 사용 준비
		dao.select(); // SELECT query해서 dtos에 담아두기
		List<StudentDTO> dtos = dao.getStudentDTOs(); // dtos를 꺼내기
		for(StudentDTO d : dtos){
			System.out.print(d.getId()+"\t");
			System.out.print(d.getStNum()+"\t");
			System.out.print(d.getStName()+"\t");
			System.out.print(d.getStClass()+"\t");
			System.out.print(d.getStMajor()+"\n");
		}
	}
}
