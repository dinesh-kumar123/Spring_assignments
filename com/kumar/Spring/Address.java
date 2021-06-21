package com.kumar.Spring;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	public String getStreet() {
		return "Temple Street";
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return "Koyyalagudem";
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return "andhra";
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return 534312;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return "india";
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
