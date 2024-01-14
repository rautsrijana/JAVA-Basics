package com.package2;

import com.package1.One;

public class Four extends One{
	public static void main(String[] args) {
		Four obj = new Four();
        obj.publicMethod();
        obj.protectedMethod();
//        obj.defaultMethod();  // Error:default cant be acced
        // obj.privateMethod(); // Error: not accessible

	}

}
