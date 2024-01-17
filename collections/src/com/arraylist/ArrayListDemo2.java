package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>(); 
		System.out.println(list1.size());
		list1.add(4);
		list1.add(10);
		list1.add(1);
		list1.add(100);
//		list1.add("Soojan");
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.get(3));
		System.out.println(list1.remove(0));
		
		Collections.sort(list1);
		System.out.println(list1);
	}

}
