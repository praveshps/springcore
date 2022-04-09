package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");
		
		//Student s = (Student) context.getBean("ob");  -> if the name of the bean is changed
		Student s = (Student) context.getBean("student");
		System.out.println(s);
		System.out.println("Student ->" +s.hashCode());
		System.out.println(s.getAddress());
		Student s1 = (Student) context.getBean("student");
		System.out.println("Student ->" +s1.hashCode());
		
		Teacher t = (Teacher) context.getBean("teacher");
		System.out.println("Teacher ->" +t.hashCode());
		Teacher t1 = (Teacher) context.getBean("teacher");
		System.out.println("Teacher ->" +t1.hashCode());
	}

}
