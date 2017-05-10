package com.bit.parents;

public class Market {
	
	public int intDan ; // 상품단가
	public int intSu ; // 상품 수량
	
	public int intTotal ; // 상품 가격
	
	public void mTotal() {
		intTotal = intDan * intSu;
	}
	
}
