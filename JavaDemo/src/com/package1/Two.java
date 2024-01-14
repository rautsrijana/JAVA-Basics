package com.package1;

public class Two {
	public static void main(String[] args) {
		One obj = new One();
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        // obj.privateMethod(); // Error: not accessible

	}

}
