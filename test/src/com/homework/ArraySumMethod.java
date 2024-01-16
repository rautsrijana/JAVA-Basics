package com.homework;
import java.util.Scanner;

public class ArraySumMethod {
	// Method to calculate the sum of array values
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    //main method
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] numbers = new int[size];

        // Read elements of the array from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calling the method to calculate the sum of array values
        int sum = calculateSum(numbers);

        // Displaying the array
        System.out.print("Array = [");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Displaying the sum of array values
        System.out.println("Sum of array values = " + sum);


    }

 }

