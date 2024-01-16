package com.homework;

public class ArraySumExample {
    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {55, 10, 8, 90, 43};

        // Variable to store the sum
        int sum = 0;

        // Calculate the sum of array values
        for (int num : numbers) {
            sum += num;
        }

        // Display the array
        System.out.print("Array = [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Display the sum of array values
        System.out.println("Sum of array values = " + sum);
    }
}

