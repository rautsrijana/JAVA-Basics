package com.assignment;

import java.util.Comparator;

public class MobileSortUsingComparator implements Comparator<Mobile>{


	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
		
		return Integer.compare(o1.getPrice(), o2.getPrice());
	}
	

}