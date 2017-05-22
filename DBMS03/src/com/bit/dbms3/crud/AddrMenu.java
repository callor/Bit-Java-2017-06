package com.bit.dbms3.crud;

import java.util.Scanner;

public class AddrMenu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		AddrSelect addrSelect = new AddrSelect();
		
		while(true){
			System.out.println("주소록 관리");
			System.out.println("=======================================");
			System.out.println("1.보기  2.등록  3.수정   4.삭제  5.종료");
			System.out.println("=======================================");
			System.out.print("선택>>");
			
			String keyin = scanner.nextLine();
			int intKey = 0 ;
			try{
				intKey = Integer.valueOf(keyin);	
			} catch( NumberFormatException e) {
			
			}
			

			if(intKey == 5) break;
			
			switch(intKey) {
			case 1 :  // 리스트 보기
				addrSelect.listView();
				break ;
			case 2 :
				AddrInsert addrInsert = new AddrInsert();
				addrInsert.insert();
				break ;
				
			case 3 :
				addrSelect.listView();
				AddrUpdate addrUpdate = new AddrUpdate();
				System.out.print("수정할 ID>>");
				addrUpdate.update(scanner.nextInt());
				break;
			case 4 :
				// 리스트를 보여주고
				addrSelect.listView();
				AddrDelete addrDelete = new AddrDelete();
				//삭제할 ID를 입력받아
				System.out.print("삭제할 ID>>");
				// ID 값을 넘겨서 데이터 삭제
				addrDelete.delete(scanner.nextInt());
				break;
			}

			
		}
		System.out.println("종료되었습니다");		
		
		
		
		
	}

}
