package com.bit.params;

public class ClassFuncCall {

	public static void main(String[] args) {
		
		// 다른 객체에 있는 자원(변수, 함수 ...)을 사용하기 위한준비
		// Class
		//          object(객체, 인스턴스:instance)
		//                        object를 만들기 위한 생성자
		ParamsMulty paramsMulty = new ParamsMulty();

		System.out.println("2의 배수");
		System.out.println("========================");
		for(int i = 2; i < 10; i++){
			int _t = paramsMulty.multiple(i);
			if(_t % 2 == 0 ){
				System.out.printf(
						"%d의 배수의 합 %d은(는) 2의 배수입니다\n",
						i, _t);
			}
		}
		
		System.out.println("3의 배수");
		System.out.println("========================");
		for(int i = 2; i < 10; i++){
			int _t = paramsMulty.multiple(i);
			if(_t % 3 == 0 ){
				System.out.printf(
						"%d의 배수의 합 %d은(는) 3의 배수입니다\n",
						i, _t);
			}
		}
		
		System.out.println("2와 3의 배수");
		System.out.println("========================");
		for(int i = 2; i < 10; i++){
			int _t = paramsMulty.multiple(i);
			// && : AND, || : OR  ==> 관계연산자
			if(_t %2 == 0 && _t % 3 == 0 ){
				System.out.printf(
						"%d의 배수의 합 %d은(는) 2와 3의 배수입니다\n",
						i, _t);
			}
		}
	}

}







