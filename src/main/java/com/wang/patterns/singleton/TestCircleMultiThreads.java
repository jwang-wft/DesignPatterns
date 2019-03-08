package com.wang.patterns.singleton;

public class TestCircleMultiThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			Thread t = new Thread(new MakeCircle());
			System.out.print("Thread " + i + ": " + t.hashCode());
			System.out.println();
			t.start();
		}
	}

}

class MakeCircle implements Runnable{

	public void run() {
		Circle.getInstance();
	}
	
}