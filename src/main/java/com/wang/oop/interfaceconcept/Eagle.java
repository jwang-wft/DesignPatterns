package com.wang.oop.interfaceconcept;

public class Eagle implements Animal, Bird {

	public void fly() {
		System.out.println("Flies up to 10,000 feet.");
	}

	public void eat() {
		System.out.println("Eats reptiles and amphiians.");
	}

	public void sound() {
		System.out.println("Has a high-pitched whistling sound.");
	}

}
