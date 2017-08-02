package edu.mum;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private Address address; 
	private List<Customer> list=new ArrayList<Customer>();
	

	public Customer(String name, Address address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	private String phone;

	public void addList(Customer cust)
	{
		list.add(cust);
	}

}
