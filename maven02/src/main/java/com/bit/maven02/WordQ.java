package com.bit.maven02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.bit.maven02.dao.WordDAO;
import com.bit.maven02.dto.WordDTO;

public class WordQ {

	public static void main(String[] args) {

		WordDAO dao = new WordDAO();
		
		WordDTO dto = dao.getWord();// 단어 1개 추출
		String word = dto.getWord(); // 단어만 추출
		
		String[] words = word.split("");// 글자단위로 분리
		List<String> arrWord = new ArrayList<String>();
		
		// 배열을 (Array)List에 복사
		arrWord = Arrays.asList(words);
//		for(String s : words){
//			arrWord.add(s);
//		}
		Collections.shuffle(arrWord);// 글자 뒤섞기
		
		System.out.println("다음의 알파벳을 단어로 완성하시오");
		System.out.println(arrWord); // 보여주기
		System.out.println("---------------------------------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(">>");
		String keyin = scanner.nextLine(); // 키입력
		if(keyin.equalsIgnoreCase(word)) { // 맞으면
			System.out.println("맞았습니다");
		} else {
			System.out.println("정답은 " + word + " 입니다");
		}
		
		
	}

}
