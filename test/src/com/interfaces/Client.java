package com.interfaces;

// here the implementation details are hiding - properties of abstraction
public class Client {
	public static void main(String[] args) {
		
	//we cannot create the object of interface
	// but we can create the refrence of interface
	int[] arr = new int[] {1,2,7,8,9,10, 3,43};
	Sort sort	= new SortImpl();
	int[] sorted1 = sort.sort(arr);
	for (int x :sorted1) {
		System.out.println(x);
	}
	
	//
	System.out.println("This is another implementation in descending order!!!");
	sort = new SortImpl2();
	int[] sorted2 = sort.sort(arr);
	for (int x :sorted2) {
		System.out.println(x);
	}
	
	
	
	
	}

}
