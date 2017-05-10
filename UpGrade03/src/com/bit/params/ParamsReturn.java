package com.bit.params;

public class ParamsReturn {

	public static void main(String[] args) {

		int intRet7 = multiple(0,1000,7);
		int intRet6 = multiple(0,1000,6);
		int intRet5 = multiple(0,1000,5);
		
		int intTotal = intRet7 + intRet6 + intRet5 ;
		System.out.println(intTotal);
	}
	
	static int multiple(int intStart, int intEnd, int intMulti){
		
		int intSum = 0;
		for(int i = intStart; i<= intEnd;i++){
			if(i % intMulti == 0){
				intSum += i;	
			}
		}
		return intSum ;
	}
}



