package com.bit.dbinterface;

public interface CRUD {

	public void select();
	public void select(int id);
	
	public void insert();
	public void update();
	public void delete(int id);
	
}
