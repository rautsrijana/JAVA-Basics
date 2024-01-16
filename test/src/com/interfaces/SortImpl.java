package com.interfaces;

import java.util.Arrays;

public class SortImpl implements Sort{


	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		return arr; //ascending order
	
	}
	
	
	

}
