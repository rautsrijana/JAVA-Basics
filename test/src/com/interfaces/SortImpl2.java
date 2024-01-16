package com.interfaces;

import java.util.Arrays;
import java.util.Collections;

public class SortImpl2 implements Sort{


	@Override
	public int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i<arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}

}
