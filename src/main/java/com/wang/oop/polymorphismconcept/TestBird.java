package com.wang.oop.polymorphismconcept;

public class TestBird {
	public static void main(String[] args){
		Bird myBird = new Bird();
		//three over loaded fly() methods
		myBird.fly();
		myBird.fly(10000);
		myBird.fly("eagle", 10000);		
		
		Animal myAnimal = new Animal();
		myAnimal.eat();
		
		MyBird bird = new MyBird();
		bird.eat(); //will call subclass eat() method instead of superclass.
	}
}
