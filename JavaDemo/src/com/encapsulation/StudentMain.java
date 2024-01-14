package com.encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student student1 = new Student();
	
	System.out.println(student1);
	
	// try to access id directly
//	System.out.println(student1.id); //error as id is private so you cannot access directly
	// Thus, access using getter
	System.out.println(student1.getId());
	System.out.println(student1.getName());
	
	//wanted to modify name
	student1.setId(100);
	student1.setName("Srijana");
	student1.setPassword("1234");
	//after modifying contents of student1
	System.out.println(student1);
	
	//trying to change the id again
	student1.setId(-90);
	System.out.println(student1);
	
	}

}
