package com.package1;

public class ExampleClass {
    private int value;
    private String message;

    // First constructor
    public ExampleClass() {
        this.value = 0;
        this.message = "Default";
    }

    // Second constructor
    public ExampleClass(int value) {
        this.value = value;
        this.message = "Integer Initialized";
    }

    // Third constructor
    public ExampleClass(String message) {
        this.value = 0;
        this.message = message;
    }

    // First method
    public void displayValue() {
        System.out.println("Value: " + value);
    }

    // Second method
    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    // Main method to demonstrate the use of constructors and methods
    public static void main(String[] args) {
        ExampleClass obj1 = new ExampleClass();
        obj1.displayValue();
        obj1.displayMessage();

        ExampleClass obj2 = new ExampleClass(10);
        obj2.displayValue();
        obj2.displayMessage();

        ExampleClass obj3 = new ExampleClass("Hello World");
        obj3.displayValue();
        obj3.displayMessage();
    }
}

