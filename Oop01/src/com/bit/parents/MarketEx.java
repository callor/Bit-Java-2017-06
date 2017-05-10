package com.bit.parents;

// Market을 상속
public class MarketEx extends Market{

	
	public void mTotal(){
		
		// 부가세를 뺀 가격 계산
		intTotal = (int)(intDan / 1.1) * intSu;
		
	}
	
}
