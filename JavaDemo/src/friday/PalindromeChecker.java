package friday;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check if the string is a Palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lower case for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        // Check if characters from both ends match
        while (end > start) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true; 
        }
}

