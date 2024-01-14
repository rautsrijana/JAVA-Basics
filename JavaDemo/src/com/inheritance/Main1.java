package com.inheritance;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.jump();
		dog1.run();
		
		// child class creating object
		AeroDog aerodog1 = new AeroDog();
		aerodog1.jump();
		aerodog1.run();
		
		aerodog1.fly();
		aerodog1.swim();
		
		
		// parent class reference variable can 
		// point to child class object also
		dog1 = new AeroDog();
		dog1.jump();
		dog1.run();
		
		// fly() is specific method of child you need downcasting
		((AeroDog)dog1).fly();
		((AeroDog)dog1).swim();
		
		// override method
		((AeroDog)dog1).run();
		

	}

}
