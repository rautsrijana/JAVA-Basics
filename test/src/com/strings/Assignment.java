package com.strings;


public class Assignment {
    public static void main(String[] args) {
        // Create a string
        String originalString = "Srijana";

        // Use StringBuilder to reverse the string
        StringBuilder reversedStringBuilder = new StringBuilder(originalString);
        reversedStringBuilder.reverse();

        // Convert StringBuilder back to String
        String reversedString = reversedStringBuilder.toString();

        // Display the original and reversed strings
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}

