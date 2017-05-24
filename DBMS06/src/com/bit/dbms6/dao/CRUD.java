package com.bit.dbms6.dao;

public interface CRUD {
	
	public void select();
	public void select(int id);
	
	public void insert();
	public void delete(int id);
	public void update();

}
