package classandobject;

public class Dog {
	
	// constructors
	public Dog() {
		
	}
	
	public Dog(String breed) {
		System.out.println("This dog has breed=" +breed);
	}
	
	int tail = 1;
	String color = "white";
	int age = 4;
	
	//behaviour
	public void run() {
		System.out.println("The dog can run!!!!!!!!!!!!!");
	}
	public void bark() {
		System.out.println("The dog can bark!!!!!!!!!!!!!");
	}
	public void eat() {
		System.out.println("The dog can eat!!!!!!!!!!!!!");
	}
	public void sleep() {
		System.out.println("The dog can sleep!!!!!!!!!!!!!");
	}

}
