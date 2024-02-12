package com.main;

import com.model.Address;
import com.model.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(); //  a programmer creates this object
		emp.setEmpid(123);
		emp.setEmpName("Srijana");
		emp.setEmail("srijana123@gmail.com");
		emp.setAge(35);
		
		Address address = new Address();
		address.setDoorno(566);
		address.setStreetName("422 N Dakota");
		address.setCity("Vermillion");
		address.setCountry("USA");
		emp.setAddress(address);
		
		System.out.println(address);
		System.out.println(emp);

	}

}
