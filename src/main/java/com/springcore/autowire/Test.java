package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/Auto_config.xml");
			Emp e = (Emp) context.getBean("emp1",Emp.class);
			System.out.println(e);
	}

}
