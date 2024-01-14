package com.package1;

public class One {
	
	public void publicMethod() {
        System.out.println("Public method called.");
    }

    private void privateMethod() {
        System.out.println("Private method called.");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called.");
    }

    void defaultMethod() {
        System.out.println("Default method called.");
    }

    void testMethods() {
        // Within Class, all methods can be called
    		System.out.println("In First Class");
        publicMethod();
        privateMethod();
        protectedMethod();
        defaultMethod();
    }
}


