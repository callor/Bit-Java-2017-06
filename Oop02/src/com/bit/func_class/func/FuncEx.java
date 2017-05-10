package com.bit.func_class.func;

public class FuncEx {

	public static void main(String[] args) {

		String[] strSharps = new String[3];
		strSharps[0] = "사각형";
		strSharps[1] = "삼각형";
		strSharps[2] = "원";

		rotate(strSharps[0]) ;
		playMove(strSharps[0]);

		rotate(strSharps[1]) ;
		playMove(strSharps[1]);
		
		rotate(strSharps[2]) ;
		playMove(strSharps[2]);

		
	}
	
	// 회전을 실행하는 함수
	static void rotate(String strSharp){
		if(strSharp.equals("원")) {
			System.out.println("원이 빗면을 중심으로 포물선 회전을 합니다");
		} else if(strSharp.equals("아메바")){
			System.out.println("아마베를 둘러싸는 사각형을 만든다");
			System.out.println("사각형 꼭지점을 중심으로 회전한다");
		}else{
			System.out.println(strSharp + "를 회전합니다");	
		}
		
	}
	
	static void playMove(String strSharp){
		System.out.println(strSharp + "를 움직입니다");
	}

}
