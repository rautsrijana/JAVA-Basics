package Overloading;

public class Car {

	public static void features(){
		System.out.println("This car can run");
		
		// TODO Auto-generated method stub

	}
	
	public static void features(String color){
		System.out.println("This car color is =:" +color);
		
		// TODO Auto-generated method stub

	}

	public static void features(int price){
		System.out.println("The price of the care is =:" +price);
		

	}
	
	public static void features(String model, int year, String type){
		System.out.println("The model of the care is =:" +model);
		System.out.println("The year of the care is =:" +year);
		System.out.println("The type of the care is =:" +type);
		

	}

}
