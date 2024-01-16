package com.package1;

public class Second {
	public static void main(String[] args) {
		First obj = new First();
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        // obj.privateMethod(); // Error: not accessible

	}

}
