package com.abstraction;

public class AverageStudents extends Student{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Srijana is walking in a snow!!");
		
	}
	
	@Override
	public void run() {
		System.out.println("I am a child and I am running like by my own. Oh wait! Not like my parents");
	}
	
	// main method
	public static void main(String[] args) {
		Student student = new AverageStudents();
		student.walk();
		student.run();
		
		// from class GoodStudents
		//student1 is pointing GoodStudents
		student = new GoodStudents();
		student.walk();
	}

}
