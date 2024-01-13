package dectask;


import java.util.Scanner;

public class ShapesArea {

    // Method to calculate the area of a rectangle
    public static double rectangleArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);

        //scanner.close();
        return area;
    }

    // Method to calculate the area of a circle
    public static double circleArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area);

        //scanner.close();
        return area;
    }

    // Method to calculate the area of a triangle
    public static double triangleArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);

        //scanner.close();
        return area;
    }

    // Method to calculate the area of a square
    public static double squareArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side of the square:");
        double side = scanner.nextDouble();

        double area = Math.pow(side, 2);
        System.out.println("The area of the square is: " + area);

        //scanner.close();
        return area;
    }

    // Method to calculate the area of a trapezoid
    public static double trapezoidArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first base of the trapezoid:");
        double base1 = scanner.nextDouble();

        System.out.println("Enter the second base of the trapezoid:");
        double base2 = scanner.nextDouble();

        System.out.println("Enter the height of the trapezoid:");
        double height = scanner.nextDouble();

        double area = 0.5 * (base1 + base2) * height;
        System.out.println("The area of the trapezoid is: " + area);

        //scanner.close();
        return area;
    }
}

