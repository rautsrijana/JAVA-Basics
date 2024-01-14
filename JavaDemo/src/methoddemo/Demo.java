package methoddemo;

import java.util.Scanner;

// method - 
public class Demo {
	
	// creating a method
	public static void rectangle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Length=:");
		int l = sc.nextInt();
		
		System.out.println("Breadth=:");
		int b = sc.nextInt();
		
		int area = l *b ;
		System.out.println("Rectangle Area=:" +area);
		
	}
	// second method for square
	
	public static void square() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("side=:");
		int side = sc.nextInt();
		
		
		int area1 = side * side ;
		System.out.println("Square Area=:" +area1);
		
	}
	
	public static void fact() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Num=:");
		int num = sc.nextInt();
		int fact = 1;
		
        
        for (int i = 1; i <= num; i++) {
        	fact = fact * i;
        }
        System.out.println("The factorial=:" +fact);
    } 
	
	
	public static void main(String[] args) {
		
		rectangle();
		square();
		fact();
		
	}
}
