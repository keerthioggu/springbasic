package com.springframeworrk;

public class Address {
	private String city;
	private String pin;
    public Address() {
    	System.out.println("test address");
    }
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}

}
