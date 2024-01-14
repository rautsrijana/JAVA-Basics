package classandobject;

public class Cowmain {
    public static void main(String[] args) {
    	Cow dd = new Cow();
		
    	System.out.println("Behaviours=: ");
		dd.walk();
		dd.eat();
		dd.run();
		dd.sleep();
		
		System.out.println(" ");
		System.out.println("Attributes=: ");
		System.out.println("This cow has a tail =  " +dd.tail);
		System.out.println("This cow has a age =  " +dd.age);
		System.out.println("This cow has a color =  " +dd.color);
		System.out.println("This cow has a name =  " +dd.name);
	}

    
}

