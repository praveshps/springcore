package com.springcore.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address1")  //incase of multiple beans, give name of the bean you want to inject
	private Address address;

	public Address getAddress() {
		return address;
	}

	// @Autowired -> to use setter injection
	public void setAddress(Address address) {
		this.address = address;
	}

	//@Autowired -> to use constructor injection
	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
