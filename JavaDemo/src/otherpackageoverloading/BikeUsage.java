package otherpackageoverloading;

import Overloading.Bike; // Importing the Bike class from Overloading package

public class BikeUsage {

    public static void main(String[] args) {
        // Create an instance of the Bike class
        Bike myBike = new Bike();

        // Call the featureRepeatedly method with a for loop
        myBike.featureRepeatedly(2); // Print a message 2 times

        // Call the featureCounting method with a for loop
        myBike.featureCounting(3); // Print numbers up to 3
    }
}
