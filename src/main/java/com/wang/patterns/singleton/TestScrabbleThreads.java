package com.wang.patterns.singleton;

public class TestScrabbleThreads {
	public static void main(String[] args){
		
		// Create a new Thread created using the Runnable interface
		// Execute the code in run after 10 seconds
				
		Runnable getTiles = new GetTheTiles();
				
		Runnable getTilesAgain = new GetTheTiles();
				
		// Call for the code in the method run to execute
				
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
		
	}
	
}

/*
 * Runing result
 * 
first thread is true...
first thread is true...
Synchronized Instance ID: 1653705780
Instance ID: 1653705780
Instance ID: 1653705780
[p, i, n, m, c, u, i, r, u, e, a, e, e, e, n, e, r, a, a, o, g, r, x, s, r, t, o, i, e, n, k, s, s, t, o, b, o, a, t, e, t, y, h, r, i, l, l, e, e, n, i, a, u, i, s, f, d, z, a, v, w, g, o, q, v, i, n, w, a, n, r, t, y, d, h, u, c, p, f, l, i, i, l, d, o, a, m, j, g, e, e, e, o, d, a, t, o, b]
[p, i, n, m, c, u, i, r, u, e, a, e, e, e, n, e, r, a, a, o, g, r, x, s, r, t, o, i, e, n, k, s, s, t, o, b, o, a, t, e, t, y, h, r, i, l, l, e, e, n, i, a, u, i, s, f, d, z, a, v, w, g, o, q, v, i, n, w, a, n, r, t, y, d, h, u, c, p, f, l, i, i, l, d, o, a, m, j, g, e, e, e, o, d, a, t, o, b]
Player: [p, i, n, m, c, u, i, r]
Player: [u, e, a, e, e, e, n, e]
Got Tiles
Got Tiles

*/