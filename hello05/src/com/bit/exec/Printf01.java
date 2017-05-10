package com.bit.exec;

public class Printf01 {

	public static void main(String[] args) {

		System.out.printf("%d x %d 는 %d 입니다\n", 5, 6, 5*6 );
		System.out.printf("나는 %s 입니다","홍길동");
		
		System.out.println("나는 " + "홍길동" + "입니다");
		
		for(int i = 1; i < 10 ; i++){
			System.out.printf("%02d x %02d = %02d\n", 5,i, 5*i);
		}
		
		for(int i = 1; i < 10 ; i++){
			System.out.printf("%2d x %2d = %2d\n", 5,i, 5*i);
		}
		
		float fNum = 3.0f ;
		System.out.printf("%3.2f\n",fNum);
		
		fNum = 3.1555f ;
		System.out.printf("%3.2f\n",fNum);
		
		fNum = 3.155f;
		System.out.printf("%3.2f\n",fNum);
		
		fNum = 3.156f;
		System.out.printf("%3.2f\n",fNum);
		
		

	}

}
