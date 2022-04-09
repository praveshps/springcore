package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config.xml");
		Person p = (Person) context.getBean("person1");
		
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("__________________________________");
		System.out.println(p);
		System.out.println(p.getProperties().getClass().getName());
	}

}
