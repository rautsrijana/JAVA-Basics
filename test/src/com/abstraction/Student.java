package com.abstraction;
//Abstract class are used for code reusability and interfaces are used to expose functionalities.
// Abstract class is a class that is declared abstract. 
//It may or may not include abstract method
// Abstract class can not be instantiated but they can be subclassed. 
//abstract class
public abstract class Student {
	
	//abstract method
	public abstract void walk();
	
	//normal method
	public void run() {
		System.out.println("Students are running");
	}
	
	

}
