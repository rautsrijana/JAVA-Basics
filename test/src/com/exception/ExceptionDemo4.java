package com.exception;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		int result=0;
		int x=100;
		int y=20;
		int z=0;	
		try {			
					
		    result=x/y;
		    System.out.println("this line will be executed if no exception before it");
		}
		catch(Exception ex) {
			
			ex.printStackTrace();
			
		}
		finally {
			
			System.out.println("finally will be executed always..no matter exception occurs or not");
		}
		System.out.println(result);
		System.out.println("you can see this line and above only when either no exception or exception is handled");
	}

}
