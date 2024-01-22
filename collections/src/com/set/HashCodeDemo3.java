package com.set;

import java.util.Objects;

public class HashCodeDemo3 {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		System.out.println(d1.hashCode()+"  "+d2.hashCode());
		
		System.out.println(d1.equals(d2));
	}
	

}


class Dog{
	String name = "tommy";
	int age = 20;
	
	//this is imp to give same hash code
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}
