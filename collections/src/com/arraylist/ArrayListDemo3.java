package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>(); 
		
		list1.add(4);
		list1.add(10);
		list1.add(1);
		list1.add(100);

		System.out.println(list1);
		
		System.out.println("iteration using for loop--------------");
		for(int i= 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("iteration using for each loop---------");
		for(int element : list1) {
			System.out.println(element);
		}
		
		System.out.println("Iteration using Iterator---------------");
		Iterator <Integer> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("Print Double each element of list-----------");
		for(int element :list1) {
			System.out.println(element*2);
		}
	}

}
