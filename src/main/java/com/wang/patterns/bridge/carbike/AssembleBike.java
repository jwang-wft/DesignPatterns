package com.wang.patterns.bridge.carbike;

public class AssembleBike implements Workshop {

	public void work() {
		System.out.print(" And ");
		System.out.println("Assemble Bike.");
	}

}
