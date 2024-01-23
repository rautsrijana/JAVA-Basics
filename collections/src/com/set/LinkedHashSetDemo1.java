package com.set;

// ordered set ma rakhxa
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		
		//default sorting is Comparable one
		Set<Integer> linkedHashset = new LinkedHashSet<>(); 
		
		linkedHashset.add(4);
		linkedHashset.add(10);
		linkedHashset.add(100);
	 
		System.out.println(linkedHashset);
		

		
		
		
	}
}
