package com.wang.patterns.bridge.carbike;

public class AssembleCar implements Workshop {

	public void work() {
		System.out.print(" And ");
		System.out.println("Assemble Car.");
	}

}
