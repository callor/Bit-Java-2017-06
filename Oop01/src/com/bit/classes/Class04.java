package com.bit.classes;

import com.bit.parents.MarketEx;

public class Class04 {

	public static void main(String[] args) {

		// 햇반 판매를 위해서 
		// 부가세가 있는 상품 계산
		MarketEx marketEx = new MarketEx();
		
		// 상품매입
		marketEx.intDan = 8000;
		marketEx.intSu = 100;
		
		marketEx.mTotal(); 
		
		int in = marketEx.intTotal;
				
		marketEx.intDan = 8800;
		marketEx.intSu = 100;
		
		marketEx.mTotal();
		
		int out = marketEx.intTotal;
		
		int margin = out - in ;
		
		System.out.println(margin);
		
	}

}
