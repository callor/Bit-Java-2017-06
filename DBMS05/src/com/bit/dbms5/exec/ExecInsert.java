package com.bit.dbms5.exec;

import com.bit.dbms5.dao.StudentDAO;
import com.bit.dbms5.dto.StudentDTO;

public class ExecInsert {

	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAO();
		studentDAO.connect();
		
		studentDAO.setStudent("20170103","성춘향",3,"문예학과");
		studentDAO.setStudent("20170104","장보고",1,"무도학과");
		studentDAO.setStudent("20170105","장영실",2,"천문학과");
		studentDAO.setStudent("20170106","임꺽정",2,"정치외교");
		
		StudentDTO dto = new StudentDTO();
		dto.stnum = "20170107";
		dto.stname = "성춘향";
		dto.stclass = 1;
		dto.stmajor = "정보통신";
		studentDAO.setStudent(dto);

		dto = new StudentDTO();
		dto.stnum = "20170108";
		dto.stname = "장보고";
		dto.stclass = 2;
		dto.stmajor = "해양수산";
		studentDAO.setStudent(dto);

		System.out.println("추가 성공");
		
		
	}

}
