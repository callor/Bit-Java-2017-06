package com.bit.classes;

import com.bit.parents.Market;

public class Class03 {

	public static void main(String[] args) {

		// 부가세가 없는 상품 계산
		Market market = new Market();
		
		// 상품 매입
		market.intDan = 8000;
		market.intSu = 100;
		
		market.mTotal(); // 상품가격 계산
		
		int intInput = market.intTotal;
		
		// 상품판매(매출)
		market.intDan = 8800;
		market.intSu = 100;
		
		market.mTotal();
		
		int intOut = market.intTotal;
		
		int intMargin = intOut - intInput; // 이익금 계산
		
		System.out.println(intMargin);
		
		
	}

}
