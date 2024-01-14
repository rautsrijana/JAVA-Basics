package com.encapsulation;

public class Student {
	
	private int id;
	private String name;
	private String password;
	
	// always use ecilipse for doing 
	// getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<0) {
			System.out.println("id cannot be negative");
		}
		else {
		this.id = id;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
