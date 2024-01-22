package com.set;

public class HashCodeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Here though both object have same content(equals gives true) but their hash code are different 
		//unless we override hash code in employee class.
		// Creating two employee objects
        Employee emp1 = new Employee("Srijana", 24, 90000);
        Employee emp2 = new Employee("Srijana", 24, 90000);

        // Printing the hash codes of the employee objects
        System.out.println("Hash Code of emp1: " + emp1.hashCode());
        System.out.println("Hash Code of emp2: " + emp2.hashCode());

        System.out.println(emp1.equals(emp2));
	}

}
