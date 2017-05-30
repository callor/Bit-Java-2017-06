package com.bit.maven02;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.bit.maven02.dao.WordDAO;
import com.bit.maven02.dto.WordDTO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// DB 연결설정완료
    	WordDAO dao = new WordDAO();
//    	dao.txt2DB();
    	
    	WordDTO dto = dao.getWord();
//    	System.out.println(dto.getWord());
//    	System.out.println(dto.getMeans());
    	
    	List<WordDTO> dtos = dao.getWords();
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("다음에 제시된 단의 뜻은?");
    	System.out.println("------------------------");
    	String word = dtos.get(0).getWord();
    	System.out.println(word);
    	
    	Collections.shuffle(dtos);
    	for(int i = 0 ; i < 4 ; i++){
    		System.out.println((i+1)+"." + dtos.get(i).getMeans());
    	}
    	System.out.print("선택>>");
    	String keyin = scanner.nextLine();
    	int intOx = Integer.valueOf(keyin) - 1;
    	
    	int index = 0;
    	for(index = 0 ; index<4 ; index++){
    		if(dtos.get(index)
    				.getWord()
    				.equalsIgnoreCase(word) &&
    				intOx == index ) {
    					System.out.println("정답입니다");
    					break;
    				}
    	}
    	if(index >= 4) System.out.println("틀렸습니다");
    }
}
