package com.GLA_Spring_Maven;

public class Address {
		
	private String city;
	private String state;
	private String country;
	private int pinCode;
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public int getPinCode() {
		return pinCode;
	}
}