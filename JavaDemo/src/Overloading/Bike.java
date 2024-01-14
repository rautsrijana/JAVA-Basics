package Overloading;

public class Bike {

    // Method 1
    public void feature() {
        System.out.println("This bike has two wheels.");
    }

    // Method 2
    public void feature(String color) {
        System.out.println("This bike is " + color + " in color.");
    }

    // Method 3
    public void feature(int price) {
        System.out.println("The price of this bike is $" + price);
    }

    // Method 4
    public void feature(String brand, int year) {
        System.out.println("This bike is a " + brand + " model of year " + year + ".");
    }

    // Method 5
    public void feature(boolean isElectric) {
        if (isElectric) {
            System.out.println("This bike is an electric bike.");
        }
        else {
            System.out.println("This bike is not electric.");
        }
    }
    
    // Method 6: Feature with a for loop for printing a message multiple times
    public void featureRepeatedly(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("Srijana Says This bike is amazing!");
        }
    }

    // Method 7: Feature with a for loop for printing numbers up to a specified limit
    public void featureCounting(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

