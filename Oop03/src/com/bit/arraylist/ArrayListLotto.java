package com.bit.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수객체를 갖는 ArrayList
		ArrayList<Integer> lottos = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 45 ; i++){
			lottos.add(i+1);
		}
		
		for(int j = 0 ; j < 10;j++){
			Collections.shuffle(lottos);
			
			ArrayList<Integer> getNums = new ArrayList<Integer>();
			for(int i = 0 ; i < 6 ; i++){
//				System.out.print(lottos.get(i).toString() + "\t");
				getNums.add(lottos.get(i));
			}
			
			Collections.sort(getNums);
			for(int i : getNums){
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}

}
