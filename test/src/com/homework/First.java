package com.homework;

public class First {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Creating a new array with the same length as the original array
        int[] newArray = new int[originalArray.length];

        // Copying elements from the original array to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Displaying elements of the original array
        System.out.println("Elements of original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        // Displaying elements of the new array
        System.out.println("\nElements of new array:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

