package com.servlet;

public class SignupDto {
	private String username;
	private String password;
	private String email;
	private String gender;
	
	//add id later on while connecting to database
	//so does its getter setter
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "SignupDto [username=" + username + ", password=" + password + ", email=" + email + ", gender=" + gender
				+ "]";
	}
	public SignupDto(int id,String username, String password, String email, String gender) {
		super();
		this.id= id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
	}
	SignupDto(){}

}
