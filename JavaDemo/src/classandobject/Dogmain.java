package classandobject;

public class Dogmain {
	public static void main(String[] args) {
		
		Dog obj1 = new Dog("German");

		
		Dog dd = new Dog();
		
		dd.bark();
		dd.eat();
		dd.run();
		dd.sleep();
		
		System.out.println(" ");
		System.out.println("Attributes=: ");
		System.out.println("This dog has a tail =  " +dd.tail);
		System.out.println("This dog has a age =  " +dd.age);
		System.out.println("This dog has a color =  " +dd.color);
	}

}
