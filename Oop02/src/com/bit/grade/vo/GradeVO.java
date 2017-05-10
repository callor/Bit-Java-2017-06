package com.bit.grade.vo;

public class GradeVO {
	
	private int intNum; // 학번
	
	private int[] intGrade = new int[10]; // 점수배열
	
	private int intTotal ;
	private int intAvg ;
	private int intRank;
	
	// 슈퍼클래스 생성자
	public GradeVO() {
		 super();
	}

	// 속성지정 생성자
	public GradeVO(int intNum, int[] intGrade, 
			int intTotal, int intAvg, int intRank) {
		
		super();
		this.intNum = intNum;
		this.intGrade = intGrade;
		this.intTotal = intTotal;
		this.intAvg = intAvg;
		this.intRank = intRank;
	
	}
	
	public int getIntNum() {
		return intNum;
	}
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}
	public int[] getIntGrade() {
		return intGrade;
	}
	public void setIntGrade(int[] intGrade) {
		this.intGrade = intGrade;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	public int getIntRank() {
		return intRank;
	}
	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}
	
	

}
