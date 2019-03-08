package com.wang.patterns.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	private static Singleton onlyInstance = null;

	String[] scrabbleLetters = { "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g",
			"g", "h", "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o", "o", "o", "o", "o", "o", "o", "p", "p", "q", "r",
			"r", "r", "r", "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z", };

	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

	// Used to slow down 1st thread
	static boolean firstThread = true;

	// Created to keep users from instantiation
	// Only Singleton will be able to instantiate this class
	private Singleton() {
	}

	// We could make getInstance a synchronized method to force
	// every thread to wait its turn. That way only one thread
	// can access a method at a time. This can really slow everything
	// down though
	// public static synchronized Singleton getInstance()
	public static Singleton getInstance() {

		if (onlyInstance == null) {

			// This is here to test what happens if threads try
			// to create instances of this class


			if (firstThread) {
				System.out.println("first thread is true...");
				firstThread = false;

				try {
					Thread.currentThread();
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			// Here we just use synchronized when the first object
			// is created. if comments out the following line, the multithreads will
			// have different instance of singleton.

			synchronized (Singleton.class) {
				if (onlyInstance == null) {
					// If the instance isn't needed it isn't created
					// This is known as lazy instantiation

					onlyInstance = new Singleton();
					System.out.println("Synchronized Instance ID: " + System.identityHashCode(onlyInstance));

					// Shuffle the letters in the list
					Collections.shuffle(onlyInstance.letterList);
				}
			}
		}

		// Under either circumstance this returns the instance
		System.out.println("Instance ID: " + System.identityHashCode(onlyInstance));
		System.out.println(onlyInstance.letterList);
		return onlyInstance;
	}
		
	public LinkedList<String> getLetterList() {

		return onlyInstance.letterList;

	}

	public LinkedList<String> getTiles(int howManyTiles) {

		// Tiles to be returned to the user

		LinkedList<String> tilesToSend = new LinkedList<String>();

		// Cycle through the LinkedList while adding the starting
		// Strings to the to be returned LinkedList while deleting
		// them from letterList

		for (int i = 0; i <= howManyTiles; i++) {

			tilesToSend.add(onlyInstance.letterList.remove(0));

		}

		// Return the number of letter tiles requested

		return tilesToSend;

	}

}