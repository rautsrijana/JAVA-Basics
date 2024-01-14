package com.p1;

public class B {
	
	public static void main(String[] args) {
	
		A a = new A();
		//error as p is private so cannot be accessed outside class A
//		System.out.println(a.p);
		System.out.println("Class B");
		System.out.println("Default Properties:" +a.q);
		System.out.println("Protected Properties:" +a.r);
		System.out.println("Public Properties:" +a.s);
		
		a.magic();
		
	}
	
	
}


