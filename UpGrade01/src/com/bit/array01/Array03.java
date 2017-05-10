package com.bit.array01;

public class Array03 {

	public static void main(String[] args) {

		// 국어점수 100명분을 담을 배열을 생성
		int[] arrKor = new int[10];
		
		// 배열의 첨자는 변수를 쓸수다.
		for(int i = 0; i < arrKor.length; i++){
			arrKor[i] = (int)(Math.random() * (100-50)+50 ) ;
		}
	
		System.out.println("정렬전");
		for(int i = 0 ; i < arrKor.length;i++){
			System.out.print(arrKor[i]+"\t");
		}
		System.out.println();
		
		// 버블정렬
		for(int i = 0 ; i < arrKor.length;i++){
			for(int j = i; j < arrKor.length;j++) {
				if(arrKor[i] < arrKor[j]) {
					int _temp = arrKor[i];
					arrKor[i] = arrKor[j];
					arrKor[j] = _temp ;
				}
			}
		}
		
		System.out.println("정렬후");
		for(int i = 0 ; i < arrKor.length;i++){
			System.out.print(arrKor[i]+"\t");
		}
		System.out.println();
	}
}
