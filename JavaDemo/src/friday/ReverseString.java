package friday;

import java.util.Scanner;

public class ReverseString {
	// main method
	public static void main(String[] args) {
        // Test the reverse method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
        String originalString = sc.nextLine();
        
        //calling the reverse method
        String reversedString = reverse(originalString);
        
        // to display the things
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
	
    public static String reverse(String input) {
    	// input string to Char Array
        char[] in = input.toCharArray();
        // initialize pointers
        int begin = 0;
        int end = in.length - 1;
        char temp;
        // swapping character in a loop
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    
}

