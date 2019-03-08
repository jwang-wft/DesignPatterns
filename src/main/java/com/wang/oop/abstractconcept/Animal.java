package com.wang.oop.abstractconcept;

public abstract class Animal {
	protected abstract void move();
	protected abstract void eat();
	
	public void label(){
		System.out.println("Animal's data");
	}
}
