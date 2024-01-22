package com.assignment;

public class Mobile implements Comparable<Mobile> {
	private String model;
	private String color;
	private int price;
	
	//constructor
	public Mobile(String model, int price, String color) {
		super();
		this.model = model;
		this.price = price;
		this.color = color;
	}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", color=" + color + ", price=" + price + "]";
	}




	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return this.price - o.price;     // Compare based on price

	}

}
