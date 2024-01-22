package com.set;

//two diff object may have same hash code like i1 and s1. 

public class HashCodeDemo1 {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		System.out.println(i.hashCode());
		
		Integer i1 = new Integer(106926885);
		System.out.println(i1.hashCode());
		
		String str = new String("soojan");
		System.out.println(str.hashCode());
		
		// here the str1 and str2 are different object but the content are same. so hash code should be same.if not we should make that equal.
		String str1 = new String("prabh");
		System.out.println(str1.hashCode());

		String str2 = new String("prabh");
		System.out.println(str2.hashCode());
		
		System.out.println(str1.equals(str2));

		
	}

}
