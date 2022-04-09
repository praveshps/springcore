package com.springcore.constructorinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinj/Cons_config.xml");
		Person p = (Person) context.getBean("person");
		Addition a = (Addition) context.getBean("addition");
		a.doSum();
		
		System.out.println(p);

	}

}
 