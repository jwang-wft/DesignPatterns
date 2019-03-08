package com.wang.patterns.bridge.carbike;

public class Assemble implements Workshop {

	public void work() {
		System.out.print(" And");
		System.out.println(" Assembled.");
	}

}
