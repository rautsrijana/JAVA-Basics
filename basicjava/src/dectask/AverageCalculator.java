package dectask;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");

        double sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        scanner.close();

        double average = sum / 10;

        System.out.println("The average of the 10 numbers is: " + average);
    }
}
