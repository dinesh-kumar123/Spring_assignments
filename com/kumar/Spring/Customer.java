package com.kumar.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int Customerid;
	private String CustomerName;
	private double customerContact;
	@Autowired
	private Address customeraddress;
	public int getCustomerid() {
		return 1234;
	}
	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}
	public String getCustomerName() {
		return "dinesh";
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public double getCustomerContact() {
		return 703253136;
	}
	public void setCustomerContact(double customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customeraddress = customerAddress;
	}
	public void customerDetails() {
		System.out.println("Customer id =" + getCustomerid());
		System.out.println("CustomerName =" + getCustomerName());
		System.out.println("CustomerContact =" +getCustomerContact());
		System.out.println("CustomerAddress =" + getCustomeraddress().getCity()+ " " 
		+ getCustomeraddress().getCountry()+ "" + getCustomeraddress().getZip()+ "" 
		+getCustomeraddress().getState()+ "" + getCustomeraddress().getStreet());
		
	}
	

}
