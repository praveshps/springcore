package com.springcore.constructorinj;

public class Addition {
	private int a;
	private int b;
	
	// according to order constructor injection is being done
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("INT");
	}
	
	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("DOUBLE");
	}
	
	//string is given preference in case of ambiguity due to value being passed as String in xml file
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("STRING");
	}
	
	public void doSum() {
		System.out.println("Sum is "+(this.a+this.b));
	}
	
}
