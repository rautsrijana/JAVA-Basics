package Overloading;

public class GlobalandLocal {
	//Global variable inside class scope
	String color = "Red";
	
	public void feature() {
		// local variable scope is inside to this only
		String color = "blue";
	}
	
	public void f1() {
		String color = "green";
		System.out.println("The color=" +color);
	}

}
