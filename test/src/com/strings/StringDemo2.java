package com.strings;

public class StringDemo2 {
	public static void main(String[] args) {
		String str1 = "Srijana";
		String str2 = "Charlie";
		
		String str3 = "Dave";
		
		//finding the length of a string
		System.out.println(str1.length()); //7
		System.out.println(str2.length());  //7
		System.out.println(str3.length());  //4
		
		//Substring()......
		System.out.println(str1.substring(1)); //rijana
		System.out.println(str2.substring(2));  //arlie
		System.out.println(str3.substring(0));  //Dave
		
		
		System.out.println(str1.substring(0,5)); //no output
		System.out.println(str1.substring(0,0)); //no output
		System.out.println(str1.substring(7,7));  //no output
		System.out.println(str1.substring(4,4));  //Dave

		System.out.println(str2.substring(1,2));  //h
		System.out.println(str3.substring(0,4));  //Dave
		
		//charAt(int index)
		System.out.println(str3.charAt(0)); //D
		System.out.println(str3.charAt(str3.length()-1)); //e

		
	}

}
