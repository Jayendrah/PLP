package com.cg.ems.web.dto;

public class UserRegistrationDto {
	
	private String userName ;
	private String userPassword ;
	private String userType ;
	
	public UserRegistrationDto(String userName, String userPassword, String userType) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
	}

	public UserRegistrationDto(){
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "UserRegistrationDto [userName=" + userName + ", userPassword=" + userPassword + ", userType=" + userType
				+ "]";
	}
	
	
}
