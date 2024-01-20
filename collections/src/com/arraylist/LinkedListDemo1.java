package com.arraylist;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new LinkedList<>(); 
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

