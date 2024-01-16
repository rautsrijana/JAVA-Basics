package com.homework;
import java.util.Scanner;


public class FindLargestElement {
    // Method to find the largest element in an array
    public static int findLargest(int[] array) {
        if (array == null || array.length == 0) {
            // Handle empty or null array
            throw new IllegalArgumentException("Array is empty or null");
        }

        int largest = array[0];

        // Iterate through the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
    	// Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store user input
        int[] numbers = new int[size];

        // Prompt the user to enter array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        

        // Call the method to find the largest element
        int largestElement = findLargest(numbers);

        // Print the result
        System.out.println("The largest element is: " + largestElement);
    }
}

