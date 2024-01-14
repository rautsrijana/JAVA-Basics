package com.p2;

import com.p1.A;

public class D extends A{
	public static void main(String[] args) {
//		A a = new A();
//		System.out.println(a.p);
//		System.out.println(a.q);
		
		D d = new D();
		//protected can be accessed outside package only
		// by the object of child class
		System.out.println("Class D");
		System.out.println("Protected Properties:" +d.r);
		System.out.println("Public Properties:" +d.s);

		
	}
	
}
