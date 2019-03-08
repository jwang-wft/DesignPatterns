package com.wang.oop.abstractconcept;

public class Bird extends Animal {

	@Override
	public void move() {
		System.out.println("Moves by flying...");

	}

	@Override
	public void eat() {
		System.out.println("Eats birdfood.");
	}

}
