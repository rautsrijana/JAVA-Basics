package com.arraylist;

//common behaviour of list
//it is dynamic
//it allows duplicate elements
//it does not use hashcode
//

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(); //blalnk array list
		
		list1.add(4);
		list1.add(10);
		list1.add("Soojan");
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>(); //array list contains only integer
		list2.add(4);
		list2.add(10);
//		list2.add("Soojan"); //Error coz it only contains integers.
		System.out.println(list2);
		
		
		ArrayList<String> list3 = new ArrayList<>(); //array list contains only string
//		list3.add(4); //Error coz it only contains string
//		list3.add(10);
		list3.add("Soojan"); 
		System.out.println(list3);
		
		
		
	}

}
