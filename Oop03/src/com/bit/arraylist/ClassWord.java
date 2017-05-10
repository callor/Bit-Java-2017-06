package com.bit.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClassWord {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();
		
		words.add("television");
		words.add("computer");
		words.add("yesterday");
		words.add("tomorrow");
		words.add("christmas");
		words.add("korea");

		words.add("public");
		words.add("private");
		words.add("protected");
		words.add("class");
		words.add("package");
		
		// 임의 단어 추출
		Collections.shuffle(words);
		String strWord = words.get(0);
		
//		System.out.println(strWord);
		ArrayList<String> qWord = new ArrayList<String>();
		
		// 단어를 알파벳으로 분해하여 ArrayList에 담기
		for(int i = 0 ; i<strWord.length();i++){
			String t = strWord.substring(i,i+1);
			qWord.add(t);
		}
		Collections.shuffle(qWord);
		
		System.out.println("다음 제시된 알파벳으로 단어를 완성하시오");
		for(String s : qWord){
			System.out.print(s+"\t");
		}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine(); // 키보드에서 입력받기
		
		if(input.equalsIgnoreCase(strWord)) {
			System.out.println("참 잘했어요");
		} else {
			System.out.println("아쉽네요");
			System.out.println(strWord);
		}
	}

}
