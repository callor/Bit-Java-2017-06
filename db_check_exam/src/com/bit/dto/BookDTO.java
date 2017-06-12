package com.bit.dto;

public class BookDTO {

	private int id;
	private String bookCode;
	private String bookTitle;
	private String bookGenre;
	private String bookComp;
	private int bookPrice ;
	
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDTO(int id, String bookCode, String bookTitle, String bookGenre, String bookComp, int bookPrice) {
		super();
		this.id = id;
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.bookGenre = bookGenre;
		this.bookComp = bookComp;
		this.bookPrice = bookPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	public String getBookComp() {
		return bookComp;
	}
	public void setBookComp(String bookComp) {
		this.bookComp = bookComp;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", bookGenre=" + bookGenre
				+ ", bookComp=" + bookComp + ", bookPrice=" + bookPrice + "]";
	}
	
	
	
}
