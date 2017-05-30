package com.bit.maven02.dto;

public class WordDTO {
	
	private String word;
	private String means;
	
	public WordDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WordDTO(String word, String means) {
		super();
		this.word = word;
		this.means = means;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeans() {
		return means;
	}
	public void setMeans(String means) {
		this.means = means;
	}
	@Override
	public String toString() {
		return "WordDTO [word=" + word + ", means=" + means + "]";
	}
	
	
	

}
