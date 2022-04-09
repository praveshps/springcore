package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//implement InitializingBean and DisposableBean for init() and destroy()
public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	//init()
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init using implement");
	}

	//destroy()
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy using implement");
	}
}