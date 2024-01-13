package basicjava;
import java.util.Scanner;

public class ReverseArray {

    // Function to reverse the elements of the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }

    // Function to print the elements of the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void reverseAndPrintArray() {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an array with the given size
        int[] array = new int[size];

        // Prompt the user to enter each element of the array
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Display the original array
        System.out.println("Original Array:");
        printArray(array);

        // Reverse the array
        reverseArray(array);

        // Display the reversed array
        System.out.println("\nReversed Array:");
        printArray(array);

        // Close the Scanner to avoid resource leaks
        sc.close();
    }
}
