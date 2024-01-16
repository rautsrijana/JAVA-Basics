package com.strings;

public class StringDemo3 {
	public static void main(String[] args) {
		String str7 = "Srijana";
		String str6 = "Charlie";
		
		String str9 = "Dave";
		String str1 = "Soojan";
		String str2 = "Soojan";
		String str3 = "prabhat";
		String str4 = "abcdef";
		String str5 = new String("Soojan");
		
		System.out.println(str3.contains("c"));
		System.out.println(str3.contains("c"));
		
		// 
		System.out.println(str1.compareTo(str2)); //0
		System.out.println(str3.compareTo(str1)); //+VE
		System.out.println(str1.compareTo(str3)); //-ve
		
		// pointing to the same contents'Soojan' though the stored memory(object) are diff
		System.out.println(str1.equals(str2)); //True
		System.out.println(str1.equals(str5));  //True
		System.out.println(str1==str5); //Compare references false
		System.out.println(str1==str2); //true
		
		
		Dog dog1 = new Dog("tommy", 5, "black");
		Dog dog2 = new Dog("Jacky", 15, "white");

		Dog dog3 = new Dog("tommy", 5, "black");
		
		
		System.out.println(dog1.equals(dog2)); //False
		System.out.println(dog1.equals(dog3)); //False if equals() not overridden

		
	}

}
