package com.bit.members.dto;

public class MemberDTO {
	
	private int id ; // auto_increment id
	private String userID ; // 사용자 ID
	private String userName ;
	private String userPasswd ;
	private String userSex ;
	private String userTel ;
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(int id, String userID, String userPasswd, String userSex, String userTel) {
		super();
		this.id = id;
		this.userID = userID;
		this.userPasswd = userPasswd;
		this.userSex = userSex;
		this.userTel = userTel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPasswd() {
		return userPasswd;
	}
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", userID=" + userID + ", userName=" + userName + ", userPasswd=" + userPasswd
				+ ", userSex=" + userSex + ", userTel=" + userTel + "]";
	}
	

	
	

}
