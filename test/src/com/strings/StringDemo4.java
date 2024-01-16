package com.strings;

// Imutable = string object cant be modified once it is created
//if we need mutable string object then we need to use StringBuilder and StringBuffer classes

// StringBuffer - is synchronized 
// StringBuilder - Not synchronized(multiple user are not allowed to use at the same time)

public class StringDemo4 {
	public static void main(String[] args) {
		String str1 = "Soojan";
//		String str1 = str1 + "Nepal";
//		String str1 = str1 + "USA";
		
		
		StringBuilder sb1 = new StringBuilder("12345");
		sb1.append(67);
		System.out.println(sb1);  //1234567

		sb1.delete(0, 2);  		
		System.out.println(sb1); //34567
		sb1.insert(0, "Begin");  //Begin34567
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Mohan");
		StringBuilder sb3 = new StringBuilder("Mohan");
		System.out.println(sb2.equals(sb3)); // FALSE Memory location are diff for sb3 and sb4
		
		
	}

}
