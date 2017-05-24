package com.bit.dbms6.dto;

public class StudentDTO {
	
	private int id;
	private String stNum;
	private String stName;
	private int stClass;
	private String stMajor;
	
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentDTO(int id, String stNum, String stName, int stClass, String stMajor) {
		super();
		this.id = id;
		this.stNum = stNum;
		this.stName = stName;
		this.stClass = stClass;
		this.stMajor = stMajor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStClass() {
		return stClass;
	}
	public void setStClass(int stClass) {
		this.stClass = stClass;
	}
	public String getStMajor() {
		return stMajor;
	}
	public void setStMajor(String stMajor) {
		this.stMajor = stMajor;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", stNum=" + stNum + ", stName=" + stName + ", stClass=" + stClass
				+ ", stMajor=" + stMajor + "]";
	}
	
	

	
}
