package methoddemo1;
import java.util.Scanner;

public class Area {
	
    // Method to calculate the area of a circle
    public static void circleArea() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();

        double area = Math.PI * Math.pow(r, 2);
        System.out.println("The area of the circle is: " + area);
    }

    // Method to calculate the surface area of a cylinder
    public static void cylinderSurfaceArea() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder:");
        double r = sc.nextDouble();

        System.out.println("Enter the height of the cylinder:");
        double height = sc.nextDouble();

        double surfaceArea = 2 * Math.PI * r * (r + height);
        System.out.println("The surface area of the cylinder is: " + surfaceArea);
    }
    
    

}
