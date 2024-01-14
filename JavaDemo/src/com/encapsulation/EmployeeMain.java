package com.encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		employee1.setEmployeeID(101);
		employee1.setEmployeeName("Srijana Raut");
		employee1.setEmployeeSalary(1200000);
		employee1.setEmployeeAge(24);
		
		//for the negative one
		employee1.setEmployeeID(-1);

		
		System.out.println(employee1);
		

	}

}
