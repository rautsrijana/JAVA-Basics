package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Employee is a custom class(created by programmer
public class ArrayListDemo5 {
	
	public static void main(String[] args) {
		List<Employee> listofEmployee = new ArrayList<>();
		
		//create some employees
		Employee emp1 = new Employee("soojan", 19,800);
		Employee emp2 = new Employee("dipesh", 21,1200);
		Employee emp3 = new Employee("Ruksha", 17,700);
		
		
		//add these employee to list
		listofEmployee.add(emp1);
		listofEmployee.add(emp2);
		listofEmployee.add(emp3);
		
		System.out.println(listofEmployee);
		
		//search 
		Employee emp = new Employee("soojan", 19,800);
		
		System.out.println(listofEmployee.contains(emp));  //false if equals() is not overridden, contains() internally calls equals()		
		
		
	}
	

}
