package com.wang.patterns.singleton;

public class TestSatellite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			Thread t = new Thread(new MakeSatellite());
			System.out.print("Thread " + i + ": " + System.identityHashCode(t));
			System.out.println();
			t.start();
		}
	}

}

class MakeSatellite implements Runnable{

	public void run() {
		Satellite.getInstance();
	}
	
}

