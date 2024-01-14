package Overloading;

public class Bikemain {

	public static void main(String[] args) {
		// Main method for testing
		Bike myBike = new Bike();

	   // Call each feature method with different sets of parameters
		myBike.feature();
	    myBike.feature("Blue");
	    myBike.feature(500);
	    myBike.feature("Mountain", 2022);
	    myBike.feature(true);
	    
	    
	 // Call the new feature methods with for loops
        myBike.featureRepeatedly(3); // Print a message 3 times
        myBike.featureCounting(5); // Print numbers up to 5
	    
	    }
}
