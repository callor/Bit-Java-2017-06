package com.bit.dbms4.exec;

import java.util.List;

import com.bit.dbms4.dto.AddrDAO;
import com.bit.dbms4.dto.AddrDTO;

public class DbExec {

	public static void main(String[] args) {

		AddrDAO dao = new AddrDAO();
		
		dao.select(); // 전체 읽기
		List<AddrDTO> dtos = dao.getAddrDTO();
		
		for(AddrDTO d : dtos){
			System.out.print(d.getName() + "\t");
			System.out.print(d.getTel() + "\t");
			System.out.print(d.getAddr() + "\t");
			System.out.print(d.getAge() + "\n");
		}
		
		
	}

}
