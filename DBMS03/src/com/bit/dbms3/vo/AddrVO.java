package com.bit.dbms3.vo;

public class AddrVO {
	
	private int id;
	private String name;
	private String tel;
	private String addr;
	private int age;
	
	public AddrVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddrVO(int id, String name, String tel, String addr, int age) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "AddrVO [id=" + id + ", name=" + name + ", tel=" + tel + ", addr=" + addr + ", age=" + age + "]";
	}
	
	
	

}
