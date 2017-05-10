package com.bit.classes;

import javax.swing.plaf.multi.MultiButtonUI;

public class MutipleExec {

	public static void main(String[] args) {
		
		Mutiple mutiple = new Mutiple();
		
		// 첫번째 방법
		int _t = mutiple.multy(0, 1000, 6);
		System.out.printf("%d의 배수의 합: %d", 6 , _t);

		// 두번째 방법
		mutiple.intStart = 0 ;
		mutiple.intEnd = 1000;
		mutiple.intM = 7;
		mutiple.multy();
		
		System.out.printf("%d의 배수의 합: %d",7
				, mutiple.intSum);
		
	
		
		
	}

}
