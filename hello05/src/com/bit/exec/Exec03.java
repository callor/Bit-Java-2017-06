package com.bit.exec;

public class Exec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 3842420;
		int intMoney = 50000;
		int sw = 0;
		while(intMoney  > 5){
//			System.out.println(intMoney);
			int _temp = (int)(intPay / intMoney);
			
//			System.out.println(intMoney+" 원권: " + _temp + " 매");
			System.out.printf("%d 원권: %d 매\n", intMoney, _temp);
			
			intPay = intPay - (_temp * intMoney);
			if(sw == 0){
				intMoney = intMoney / 5;
				sw = 1;
			}else{
				intMoney = intMoney / 2;
				sw = 0;
			}
//			if(intMoney < 10) break;
		}
	}

}
