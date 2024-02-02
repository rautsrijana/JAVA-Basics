package com.thothitweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Selectspecifiedrecord {

	public static void main(String[] args) {
		
		try {
			//step1: load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded");
			
			
			//step 2: create the connection
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thothitweb_db","root","Shree@18");
	System.out.println("connection has been created");
	
	//step 3: fire the query
	String selectQuery="select * from users where id = ?";
	PreparedStatement ps= conn.prepareStatement(selectQuery);
	ps.setInt(1, 3);
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getInt(1)+ " " +rs.getString(2)+" " +rs.getString(3)+" " +rs.getString(4)+" ");
		
	}
		}
	
	catch(Exception e) {
		e.printStackTrace();
	}
		}
		

	}


