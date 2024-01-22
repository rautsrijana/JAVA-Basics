package com.assignment;

import java.util.HashSet;
import java.util.Set;

public class HashSetAssignment {

    public static void main(String[] args) {

        // Initialize an array of integers.
        int[] numbers = {9, 6, 5, 6, 3, 9};

        // Create a HashSet to store all unique elements encountered.
        Set<Integer> allElements = new HashSet<>();

        // Create another HashSet to store duplicate elements.
        Set<Integer> duplicates = new HashSet<>();

        // Loop through each element in the array 'numbers'.
        for (int number : numbers) {
            // Trying to add the current number to 'allElements'.
            // If the number is already in 'allElements', the add method returns false.
            if (!allElements.add(number)) {
                // Since the number is already in 'allElements', it's a duplicate.
                // Adding this number to the 'duplicates' set.
                duplicates.add(number);
            }
        }

        // Print the unique elements.
        System.out.println("Printing UNIQUE elements *************");
        System.out.println("The unique elements from the list are - " + allElements);

        // Print the duplicate elements.
        System.out.println("Printing DUPLICATE elements *************");
        System.out.println("The duplicate elements from the list are - " + duplicates);
    }
}

