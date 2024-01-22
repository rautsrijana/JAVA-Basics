package com.assignment;

import java.util.Set;
import java.util.TreeSet;

public class MobileSortOnPrice {
	
	public static void main(String[] args) {
		
				
		Mobile mb1 = new Mobile("Nokia", 5000, "Silver");
		Mobile mb2 = new Mobile("Android", 15000, "white");
		Mobile mb3 = new Mobile("Spice", 9000, "blue");
		Mobile mb4 = new Mobile("Iphone", 55000, "black");
		
		// using default comparable method
		Set<Mobile> tset = new TreeSet<>();
		
		tset.add(mb1);
		tset.add(mb2);
		tset.add(mb3);
		tset.add(mb4);
		System.out.println("Mobiles sorted by price using default Comparable:" +tset);
		
		
		// using comparator custum method
		Set<Mobile> tset1 = new TreeSet<>(new MobileSortUsingComparator());
        
        tset1.add(mb1);
        tset1.add(mb2);
        tset1.add(mb3);
        tset1.add(mb4);
        System.out.println("Mobile Sorted by price using Comparator" +tset1);

		
		
		
	}

}
