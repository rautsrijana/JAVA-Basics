package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arraylist.SortIntegersInDescendongOrderComparator;

public class ArrayListDuplicateExample {
	public static void main(String[] args) {
        List<Integer> listofNumbers = new ArrayList<>();
        
        // Add 5 integers to the list
        listofNumbers.add(8);
        listofNumbers.add(3);
        listofNumbers.add(11);
        listofNumbers.add(5);
        listofNumbers.add(2);
        
        System.out.println("Original Numbers: " + listofNumbers);
        
        // Sort the ArrayList of integers in descending order
        Collections.sort(listofNumbers, Collections.reverseOrder());
        System.out.println("Sorted Numbers in Descending Order: " + listofNumbers);
        
        Collections.sort(listofNumbers,new SortIntegersInDescendongOrderComparator());
		System.out.println(listofNumbers);
//        SortIntegersInDescendingOrderComparator()
    }

}
