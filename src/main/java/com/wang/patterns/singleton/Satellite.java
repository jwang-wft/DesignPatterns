package com.wang.patterns.singleton;

public class Satellite {
	private Satellite(){}
	private static class Helper {
			private static final Satellite _instance = new Satellite();
	}
	public static Satellite getInstance(){
		System.out.println("Satellite ID: " + System.identityHashCode(Helper._instance));
		return Helper._instance;
	}
}

