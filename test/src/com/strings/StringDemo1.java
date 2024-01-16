package com.strings;

//string is an inbuilt class in java
public class StringDemo1 {
	public static void main(String[] args) {
		// First way to create string
		//using string literals
		// created in intern pool memory
		// Intern pool doesn't allow duplicate elements
		String str1 = "Srijana";
		String str2 = "Srijana";
		
		String str5 = "Dave";
		
		//second way to create string
		//using new keyword
		// will be created in heap area memory
		//every time new object will be created
		String str3 = new String("Kai");
		String str4 = new String("Kai");
		
		//imp operations
		// If any operands is string the result will always be a String
		System.out.println("Kim"+"Kai"); //KimKai
		System.out.println(5+"Kai");     //5Kai
		System.out.println(5+5+"Kai");    //10Kai
		System.out.println(5+5+"Kai"+5);  //10Kai5
		System.out.println(5+5+"Kai"+5+5); //10Kai55
		
		//some important methods
		// In New Class
		
	}

}
