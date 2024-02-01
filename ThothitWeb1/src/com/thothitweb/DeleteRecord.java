package com.thothitweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {

	public static void main(String[] args) {
		
		try {
			//step1: load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded");
			
			
			//step 2: create the connection
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thothitweb_db","root","Shree@18");
	System.out.println("connection has been created");
	
	//step 3: fire the query
	String insertquery="delete from users  where id= ?";
	PreparedStatement ps= conn.prepareStatement(insertquery);
	ps.setInt(1, 2);
	
	int i =ps.executeUpdate();
	if(i>0) {
		System.out.println("record has been deleted");
	}else {
		System.out.println("record has not been inserted");
	}
		}
	
	catch(Exception e) {
		e.printStackTrace();
	}
		}
		

	}


