package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("ob) -> incase you want to change the name of the bean
@Component
@Scope("prototype")
public class Student {
	
	// to give values to the data members of the bean
	@Value("Pravesh Singh")
	private String name;
	
	@Value("Hardoi")
	private String city;
	
	//using Collection with @value , by creating standalone collection using util schema in config.xml
	@Value("#{temp}")
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
