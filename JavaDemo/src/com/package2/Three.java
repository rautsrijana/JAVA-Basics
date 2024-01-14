package com.package2;

import com.package1.One;

public class Three {
	public static void main(String[] args) {
		One obj = new One();
        obj.publicMethod();
//        obj.protectedMethod(); //
//        obj.defaultMethod(); //
        // obj.privateMethod(); // Error: not accessible

	}

}
