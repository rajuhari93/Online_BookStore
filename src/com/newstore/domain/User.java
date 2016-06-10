package com.newstore.domain;

public class User {
	
	private String userId;
	private String password;
	private String fullName;

	public User(String userId, String password, String fullName) {
		super();
		this.userId = userId;
		this.password = password;
		this.fullName = fullName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	

	@Override
	public String toString() {
		return String.format("User [userId=%s, password=%s, fullName=%s]", userId, password, fullName);
	}
	
}
