package com.encapsulation;

//Q1:- Create a Class Employee with 4 Attributes with EmployeeID ,
//EmployeeName , EmployeeSalary , Employeeage. Create getter and Setter.
//For EmployeeId all the id less then 0 is unaunthorized.

public class Employee {
    private int employeeID;
    private String employeeName;
    private double employeeSalary;
    private int employeeAge;
    
    //abstraction hide the data , encapsulation bind the data
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		if (employeeID<0) {
			System.out.println("Invalid value:Negative value cannot be stored!!");
		
		}
		else {
		this.employeeID = employeeID;
		}
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	@Override 
	//- we cannot change it we can only use it
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeAge=" + employeeAge + "]";
	}
	
	
    
    
    
    
}
