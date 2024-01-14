package methoddemo;

public class Shape {
	public static void area() {
		System.out.println("This is area method");
		
	}
	
	public static void area(int l, int b) {
		int area = l*b;
		System.out.println("This is area rectangle=:" + area);
		
	}
	
	public static void area(int side) {
		int area = side * side;
		System.out.println("This is area rectangle=:" + area);
		
	}
	
	public static void area(float r) {
		double area = 3.14 * r *r ;
		System.out.println("This is area rectangle=:" + area);
		
	
	}
	public static void area(float r, int h) {
		double area = 3.14 * r *r * h ;
		System.out.println("This is area rectangle=:" + area);
}
}
