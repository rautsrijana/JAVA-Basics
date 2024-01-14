package classandobject;

public class Calling {

	public static void main(String[] args) {
		
		//Class template variable = object of instance Car i.e., new Car()
		// object is always created as new keyword
		Car cc = new Car();
		
		cc.run();
		cc.brakes("disc brakes");
		cc.model("BMW");
		
		System.out.println(cc.color);
		System.out.println(cc.price);
		System.out.println(cc.speed);
		
		
	}
}
