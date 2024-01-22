package com.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
// used for sorting sorts(
// collection.sort is only for list not for set
// it doesn't use hashcode and equals method.
//

//we cannot use collections.sort for set
public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		//default sorting is Comparable one
		Set<Integer> tset1 = new TreeSet<>(); 
		
		tset1.add(4);
		tset1.add(10);
		tset1.add(100);
		tset1.add(100); //wii return false coz doesnt allow duplicates
		System.out.println(tset1);
		
		// not a default ie., coustom one
		Set<Integer> tset2 = new TreeSet<>(new SortDescendingComparator()); 
		
		tset2.add(4);
		tset2.add(10);
		tset2.add(100);
		tset2.add(100); //wii return false coz doesnt allow duplicates
		System.out.println(tset2);
		
		
		
	}
}
