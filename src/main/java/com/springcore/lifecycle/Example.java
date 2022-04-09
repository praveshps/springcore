package com.springcore.lifecycle;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	//It is deprecated from java 9 onwards, need to include javax.annotation-api for using this.
	//@PostContruct
	public void start() {
		System.out.println("Start");
	}
	
	//@PreDestroy
	public void stop() {
		System.out.println("Stop");
	}
}
