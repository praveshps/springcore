package com.springcore.constructorinj;

public class Person {
	private int personId;
	private String name;
	private Cert cert;
	
	public Person(int personId, String name, Cert cert) {
		this.personId = personId;
		this.name = name;
		this.cert = cert;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", cert=" + cert + "]";
	}
	
}
