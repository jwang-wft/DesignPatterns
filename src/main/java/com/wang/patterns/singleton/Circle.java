package com.wang.patterns.singleton;

public class Circle {
	private static final Circle onlyInstance = new Circle(); // this line will be executed only at class loading time.
	
	private Circle(){
	}
	
	public static Circle getInstance(){
		System.out.println("Circle Instance ID: " + onlyInstance.hashCode());
		return onlyInstance;
	}
}
/*
Result:

Thread 0: 508222260
Thread 1: 2073440883
Thread 2: 1278683798
Thread 3: 1124042716
Thread 4: 1376702760
Thread 5: 2106664795
Thread 6: 1059518486
Thread 7: 311892468
Thread 8: 814397217
Circle Instance ID: 981934525
Thread 9: 2109218127
Circle Instance ID: 981934525
Circle Instance ID: 981934525
Circle Instance ID: 981934525
Circle Instance ID: 981934525
Circle Instance ID: 981934525
Circle Instance ID: 981934525
Circle Instance ID: 981934525
Circle Instance ID: 981934525
Circle Instance ID: 981934525
*/