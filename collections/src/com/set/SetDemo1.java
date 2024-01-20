package com.set;

//un-ordered
//Doesn't allow duplicates
//based on hashCode

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
	public static void main(String[] args) {
		
		Set<Integer> hset1 = new HashSet<>(); 
		
		hset1.add(4);
		hset1.add(10);
		hset1.add(100);
		hset1.add(100); //wii return false coz doesnt allow duplicates
		System.out.println(hset1);
		
		System.out.println("iteration using for each loop---------");
		for(int element : hset1) {
			System.out.println(element);
		}
		
		System.out.println("Iteration using Iterator---------------");
		Iterator <Integer> itr = hset1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
	

