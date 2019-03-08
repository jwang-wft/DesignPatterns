package com.wang.patterns.singleton;

public class TestCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle = Circle.getInstance();
		System.out.println("1st Instance ID: " + System.identityHashCode(circle));
		Circle circle1 = Circle.getInstance();
		System.out.println("2nd Instance ID: " + System.identityHashCode(circle1));
	}

}
