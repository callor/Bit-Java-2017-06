package com.bit.upgrade5.scope;

public class Hello02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum = 10; // intNum 변수 탄생
		System.out.println(intNum); // 10
		for(int i = 0 ; i < 100 ; i++){ // i 변수 탄생
 			intNum = 20;
		} // i 변수 소멸
		System.out.println(intNum); // 20

		int j = 0 ; // j 변수 탄생
		for(j = 0 ; j < 100 ; j++){
			
		} //  j 변수 계속 유지
		System.out.println(j);
		
//		intNum2 = 200; // 변수 탄생 전
		int intNum2 = 100; // 변수 시작
		함수(intNum2); // 함수에게 매개변수 전달
		System.out.println(intNum2);
		
		int sum = 0;
		int 값1 = 100;
		int 값2 = 200;
		덧셈(값1, 값2); // 함수에 넘겨준 매개변수는
						// 그값을 다시 되돌려 받을 수 없다
		System.out.println(sum);

		sum = 덧셈1(값1, 값2); // return이 가능한 함수로 만들면
							// 결과 값을 되돌려 받을 수 있다.
		System.out.println(sum);
		
		
	} // intNum 변수 소멸, j 변수 소멸
	
	static void 덧셈(int 값1, int 값2){ // 값1, 값2 빈그릇으로 생성
										// 호출한곳에서 주는 값을 받는용도
		int sum = 값1 + 값2; // sum이 생성
	} // sum, 값1, 값2 소멸
	
	static int 덧셈1(int 값1, int 값2){
		int sum = 값1 + 값2;
		return sum;
	} // sum 소멸
	
	static void 함수(int intNum2){ // arg 가 새로 생성
		System.out.println(intNum2);
		intNum2 = 50;
	} // intNum2 소멸

}




