package com.bit.oop4.vo;

//public class BookVO extends Object {
public class BookVO {
	
	private String strTitle;
	private String strAuthor;
	private int intPrice ;
	
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
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
		this.intPrice = intPrice;
	}
	
	@Override
	public String toString() {
		return "BookVO [strTitle=" + strTitle 
				+ ", strAuthor=" 
				+ strAuthor 
				+ ", intPrice=" 
				+ intPrice + "]";
	}
	
	
	
	

}
