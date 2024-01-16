package com.homework;

public class FirstUsingMethod {
   

    // Method to copy elements from one array to another
    public static void copyArray(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }

    // Method to display elements of an array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Creating a new array with the same length as the original array
        int[] newArray = new int[originalArray.length];

        // Calling the method to copy elements from the original array to the new array
        copyArray(originalArray, newArray);

        // Displaying elements of the original array
        System.out.println("Elements of original array:");
        displayArray(originalArray);

        // Displaying elements of the new array
        System.out.println("Elements of new array:");
        displayArray(newArray);
    }
}
