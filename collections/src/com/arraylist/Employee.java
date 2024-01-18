package com.arraylist;

public class Employee implements Comparable<Employee>{ //default
	private String name;
	private int age;
	int salary;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	// generating getter and setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


	// compare 
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
//		return o.age - this.age;
		return this.name.compareTo(o.name);
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
