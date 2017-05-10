package com.bit.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayWord {

	ArrayList<String> words = new ArrayList<String>();

	String strWord;

	// 생성자
	public ArrayWord() {
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
	}

	public void viewWord() {
		// 임의 단어 추출
		Collections.shuffle(words);
		strWord = words.get(0);
		ArrayList<String> qWord = new ArrayList<String>();

		// 단어를 알파벳으로 분해하여 ArrayList에 담기
		for (int i = 0; i < strWord.length(); i++) {
			String t = strWord.substring(i, i + 1);
			qWord.add(t);
		}
		Collections.shuffle(qWord);

		System.out.println("다음 제시된 알파벳으로 단어를 완성하시오");
		for (String s : qWord) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}
	// System.out.println(strWord);

	public String getStrWord() {
		return strWord;
	}

}
