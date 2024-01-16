package com.interfacesnext;

public class Client {
	public static void main(String[] args) {
		// creating the instance of Carimp1 class
		Car carobj = new CarImp1();
		// Calling methods
		carobj.start();
		carobj.accelerate();
		carobj.brake();
		carobj.speed();
		carobj.stop();
		
	}

}
