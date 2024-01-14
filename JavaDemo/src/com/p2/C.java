package com.p2;
import com.p1.A;

public class C {
	public static void main(String[] args) {
		A a = new A();
		//error as p is private so cannot be accessed outside class A
//		System.out.println(a.p);
		// error as q can accessed only within package p1
//		System.out.println(a.q);
		// error as C is not a child class
//		System.out.println(a.r);
		System.out.println("Class C");
		System.out.println("Public Properties:" +a.s);
		
	}

}
