package com.inheritance;

public class AeroDog extends Dog{
	String jumpHeight = "10M";
	
	@Override
	void run() {
		System.out.println("I am dog and I am not running now");
	}

	
	void fly() {
		System.out.println("I am special dog and i am flying now");
	}
	
	void swim() {
		System.out.println("I am special dog and i am flying now");
	}

}
