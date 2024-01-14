package friday;

import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the count of vowels
        int vowelCount = countVowels(input);

        // Display the count of vowels
        System.out.println("Number of vowels in the string: " + vowelCount);

        // Close the Scanner
        scanner.close();
    }

    // Function to count the number of vowels in the string
    public static int countVowels(String str) {
        // Convert the string to lower case for case-insensitive comparison
        str = str.toLowerCase();

        int count = 0;

        // Check and count each vowel
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }

        return count;
    }
}
