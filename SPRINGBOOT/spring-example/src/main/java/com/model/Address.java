package com.model;

public class Address {
	
	private int doorno;
	private String streetName;
	private String city;
	private String country;
	
	
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", streetName=" + streetName + ", city=" + city + ", country=" + country
				+ "]";
	}
	
	

}


