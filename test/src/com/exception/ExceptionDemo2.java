package com.exception;

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		
		
		int x =100;
		int y = 20;
		int z = 0;
		int result = 0;
		
		try {
			result = x/z;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println(result);
		System.out.println("You can see this line and above only when either no exception or exception is handled!!");
	}


}
