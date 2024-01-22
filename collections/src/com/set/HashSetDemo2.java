package com.set;


import com.set.Employee;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

public class HashSetDemo2 {
	public static void main(String[] args) {
		Set<Employee> setofEmployee = new HashSet<>();
		
		//create some employees
		Employee emp1 = new Employee("soojan", 19,800);
		Employee emp2 = new Employee("dipesh", 21,1200);
		Employee emp3 = new Employee("ruksha", 17,700);
		Employee emp4 = new Employee("ruksha", 17,700);
		
		
		//add these employee to list
		setofEmployee.add(emp1);
		setofEmployee.add(emp2);
		setofEmployee.add(emp3);
		setofEmployee.add(emp4); ///will be added only when you have not overridden hashcode() and equals()
		System.out.println(setofEmployee);
	}
}


