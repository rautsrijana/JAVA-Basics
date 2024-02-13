package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class MainClassBean {
	
	public static void main(String[] args) {
		// create application context to load xml file
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("new.xml");
		//get the bean inside the xml file and type cast it to specific object
		Employee employee = (Employee) applicationContext.getBean("emp");
		System.out.println(employee);
		
	}

}
