package com.thothitweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMultipleRecord {

	public static void main(String[] args) {
		
		try {
			//step1: load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded");
			
			
			//step 2: create the connection
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thothitweb_db","root","Shree@18");
	System.out.println("connection has been created");
	
	//step 3: fire the query
	String insertquery="insert into users(username,password,email) values(?,?,?)";
	PreparedStatement ps= conn.prepareStatement(insertquery);
	// multiple record to insert
	String[] username = {"Sita", "Kai", "mayo", "hero"};
	String[] password = {"Sita123", "Kai234", "mayo@123", "hero123"};
	String[] email = {"Sita@email.com", "Kai@gmail.com", "mayo@gmail.com", "hero@gmail.com"};
	
	//inserting multiple records
	int count = 0; //to check how many records has been inserted
	for(int i=0; i<username.length; i++) {
		ps.setString(1, username[i]);
		ps.setString(2, password[i]);
		ps.setString(3, email[i]);
		
		count += ps.executeUpdate();
	}
	

//	int i =ps.executeUpdate();
	if(count>0) {
		System.out.println("record has been inserted");
	}else {
		System.out.println("record has not been inserted");
	}
		}
	
	catch(Exception e) {
		e.printStackTrace();
	}
		}
		

	}


