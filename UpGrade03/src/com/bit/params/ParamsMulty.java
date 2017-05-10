package com.bit.params;

public class ParamsMulty {

	/**
	 * 1. multiple(int num1, int num2, int num3) method를 작성하시오
	 * 		= 배수의 합을 구하는 method
	 * 
	 * 2. 0 부터 100까지의 수중
	 * 		2부터 9까지 각각의 배수의 합을 구하시오.
	 * 
	 * 3. 각각의 결과값이 2로 나누어 나머지가 0인 것을
	 *    찾으시오.
	 *    
	 *    = 짝수인것을 찾으시오.
	 */
	public static void main(String[] args) {
		
//		int intRet2 = multiple(0,100,2);
//		if(intRet2 % 2 == 0){
//			System.out.println(intRet2);
//		}
//	
//		multiple(0,100,3);
//		multiple(0,100,4);

		for(int i = 2; i < 10;i++){
			int _t = multiple(0, 100, i);
			if(_t % 2 == 0 ){
				System.out.printf(
						"%d의 배수합 %d은(는) 짝수입니다\n",
						i,_t);
			}
		}
	}
	static int multiple(int intMulty){
		int intSum = 0;
		for(int i = 0; i <= 1000 ; i++){
			if( i % intMulty == 0){
				intSum += i;
			}
		}
		return intSum;
	}
	
	static int multiple(int intStart, int intEnd, int intMulty){
		int intSum = 0;
		for(int i = intStart; i <= intEnd ; i++){
			if( i % intMulty == 0){
				intSum += i;
			}
		}
		return intSum;
	}

}
