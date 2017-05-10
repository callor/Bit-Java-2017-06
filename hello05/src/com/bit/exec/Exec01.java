package com.bit.exec;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Exec01 {

	public static void main(String[] args) {
		int intPay = 3752920;
		
		// 강제 형변환, 명시적 형변환
		int _temp = (int)(intPay / 50000); // 5만원권 개수 계산
		System.out.println("5만원권:" + _temp); 
		
		intPay = intPay - (_temp*50000) ; // 5만원권을 제외한 금액
		_temp = (int)(intPay / 10000) ; // 만원권 개수 계산

		System.out.println("1만원권:" + _temp);
		
		intPay = intPay - (_temp*10000) ; // 1만원권을 제외한 금액
		_temp = (int)(intPay  / 5000); // 5천원권 개수 계산
		
		System.out.println("5천원권:" + _temp);

		intPay = intPay - (_temp*5000) ;
		_temp = (int)(intPay / 1000); // 천원권 개수 계산
		
		System.out.println("1천원권:" + _temp);
		
		intPay = intPay - (_temp*1000) ;
		_temp = (int)(intPay / 500) ; // 5백원권 개수 계산
		
		System.out.println("5백원권:" + _temp);
		
	}

}
