package com.p1;

public class A {
	// ***************************PROPERTIES***********************
	// cannot access directly p
	// as p can be access within
	// this class only
	private int p = 10;
	// q could be access within package only
	int q = 30; //default access modifier
	//within package + outside package(only by child class)
	protected int r = 40;
	public int s = 50;
	
	//******************************METHODS************************************
	void magic(){
		System.out.println("I can do magic");
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println("Class A");
		System.out.println("Private Properties:" +a.p);
		System.out.println("Default Properties:" +a.q);
		System.out.println("Protected Properties:" +a.r);
		System.out.println("Public Properties:" +a.s);
		
		// Calling Methods
		a.magic();
		
	}

}
