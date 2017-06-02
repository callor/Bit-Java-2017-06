package com.bit.frame.model;

public class MemberDTO {
	
	private int id ;
	
	private String userId ;
	private String userName;
	private String userPw ;
	private String userSex ;
	private String userTel;
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(int id, String userId, String userName, String userPw, String userSex, String userTel) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.userPw = userPw;
		this.userSex = userSex;
		this.userTel = userTel;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
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
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", userId=" + userId + ", userName=" + userName + ", userPw=" + userPw
				+ ", userSex=" + userSex + ", userTel=" + userTel + "]";
	}
	
}
