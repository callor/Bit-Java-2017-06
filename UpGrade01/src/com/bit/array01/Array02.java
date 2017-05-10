package com.bit.array01;

public class Array02 {

	public static void main(String[] args) {

		int[] arrNum = new int[100];
		
		arrNum[0] = 90;
		arrNum[1] = 90;
		arrNum[2] = 90;
		arrNum[3] = 90;
		arrNum[4] = 90;
		arrNum[5] = 90;
		arrNum[6] = 90;
		arrNum[7] = 90;
		arrNum[8] = 90;
		arrNum[9] = 90;
		
		// 배열의 개수가 10개이므로 10번 첨자는 쓸수 없다.
		//arrNum[10] = 90;
		
		int intSum = 0;
		int addrNum = 0;
		
		intSum += arrNum[addrNum++];
		intSum += arrNum[addrNum++];
		intSum += arrNum[addrNum++];
		intSum += arrNum[addrNum++];
		intSum += arrNum[addrNum++];
		intSum += arrNum[addrNum++];
		
		int intSum1 = 0 ;
		for(int i = 0 ; i < arrNum.length;i++){
			intSum1 += arrNum[i];
		}
	}
}
