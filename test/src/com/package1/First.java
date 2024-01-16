package com.package1;

public class First {
	
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

    public static void main(String[] args) {
    	// Within Class, all methods can be called
		System.out.println("In First Class");
		First obj = new First();
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		
	} 
}
        
 


