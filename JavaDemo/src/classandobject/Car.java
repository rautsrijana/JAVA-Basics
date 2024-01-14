package classandobject;

//template that provide attributes and behaviour to the object
// static method belogs to class which can be call with the name of class directly.
// non static is instance method belongs to object where we need instance to call that. 

public class Car {
	
	// attributes
	String color = "Red";
	int speed = 10000;
	int price = 100000;
	
	//behaviors
	public void run() {
		System.out.println("This car can run");
	}
	public void model(String model) {
		System.out.println("This car can run=" +model);
	}
	public void brakes(String brakes) {
		System.out.println("This car has brakes=" + brakes);
	}

	

}
