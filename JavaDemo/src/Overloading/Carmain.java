package Overloading;

public class Carmain {

	public static void main(String[] args) {
		// Call the features method without parameters
        Car.features();

        // Call the features method with a String parameter (color)
        Car.features("Red");

        // Call the features method with an int parameter (price)
        Car.features(25000);

        // Call the features method with multiple parameters (model, year, type)
        Car.features("Sedan", 2022, "BMW");
    }
	

}
