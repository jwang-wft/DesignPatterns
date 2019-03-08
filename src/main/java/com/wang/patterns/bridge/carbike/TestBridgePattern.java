package com.wang.patterns.bridge.carbike;

public class TestBridgePattern {

	/*
	 * the Car is An abstraction and its implementation should be defined and extended independently from each other.
	 * 1. An abstraction and its implementation should be defined and extended independently from each other.
	 * 2. A compile-time binding between an abstraction and its implementation should be avoided so that an implementation can be selected at run-time.
	 */
	public static void main(String[] args) {
		// Constructor Dependency injection
		Vehicle vehicle1 = new Car(new ProduceCarParts(), new AssembleCar());
		vehicle1.manufacture();
		Vehicle vehicle2 = new Bike(new ProduceBikeParts(), new AssembleBike());
		vehicle2.manufacture();
	}

}
