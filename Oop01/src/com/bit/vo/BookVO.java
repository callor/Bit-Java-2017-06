package com.bit.vo;

public class BookVO {
	
	// 맴버변수를 외부에서 직접 접근하지 못하도록
	private String strTitle;
	private String strAuthor;
	
	private int intPrice;
	
	private String strDate ;
	
	// 맴버변수에 접근 할 수 있는 method 생성
	// getter, setter
	// getter : 읽기용 method
	// setter : 쓰기용(저장, 할당) method
	
	// strTitle 변수로부터 읽기
	public String getStrTitle(){
		return this.strTitle;
	}
	
	public void setStrTitle(String strTitle){
		// member
		//               parameter(매개변수)
		this.strTitle = strTitle;
	}

	public String getStrAuthor() {
		return strAuthor;
	}

	public void setStrAuthor(String strAuthor) {
		this.strAuthor = strAuthor;
	}

	public int getIntPrice() {
		return intPrice;
	}

	public void setIntPrice(int intPrice) {
		if(intPrice < 10000){
			System.out.println("금액은 1만 이상이어야 합니다");
		} else {
			this.intPrice = intPrice;	
		}
	}

	public String getStrDate() {
		return strDate;
	}

	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	
	

	
	
}
