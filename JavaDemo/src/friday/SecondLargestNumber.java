package friday;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Prompt the user to enter array elements
        System.out.print("Enter array elements: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the second largest number
        int secondLargest = findSecondLargest(array);

        // Display the second largest number
        System.out.println("The second largest number in the array is: " + secondLargest);

        // Close the Scanner
        scanner.close();
    }

    // Function to find the second largest number in the array
    public static int findSecondLargest(int[] arr) {
    	// first checking whether the size of array has atleast two 
    	// elements or not
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Return -1 to indicate an error or absence of a second largest
        }

        // initilizing the variable with min values
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // update the largest number
        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}

