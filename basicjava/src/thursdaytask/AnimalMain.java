package thursdaytask;

public class AnimalMain {
	public static void main(String[] args) {
		Animal object = new Animal();
		
		System.out.println("Behavior are= ");
		object.eat();
		object.run();
		object.move();
		object.sleep();
		object.walk();
		
		System.out.println(" ");
		//attributes
		System.out.println("Attributes are= ");
		System.out.println("The age of animal is= " + object.age);
		System.out.println("The name of animal is= " + object.name);
		System.out.println("The species of animal is= " + object.species);
		System.out.println("The  animal isWild= " + object.isWild);
		System.out.println("The weight of animal is= " + object.weight);
	

		
	}

}
