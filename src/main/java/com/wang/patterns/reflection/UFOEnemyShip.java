package com.wang.patterns.reflection;

import com.wang.patterns.abstractfactory.EnemyShip;
import com.wang.patterns.abstractfactory.EnemyShipFactory;

public class UFOEnemyShip extends EnemyShip {
	
	private String name = "";
//	private String getPrivate() { return "How did you get this"; }
	
//	private String getOtherPrivate(int thisInt, String thatString){
//		
//		return "How did you get here " + thisInt + " " + thatString;
//		
//	}
	
	public UFOEnemyShip(int number, String randString){
		
		System.out.println("You sent: " + number + " " + randString);
		
	}
	
	// We define the type of ship we want to create
	// by stating we want to use the factory that 
	// makes enemy ships
	
	EnemyShipFactory shipFactory;
	
	// The enemy ship required parts list is sent to 
	// this method. They state that the enemy ship
	// must have a weapon and engine assigned. That 
	// object also states the specific parts needed
	// to make a regular UFO versus a Boss UFO
	
	public UFOEnemyShip(EnemyShipFactory shipFactory){
		
		this.shipFactory = shipFactory;
		
	}

	// EnemyShipBuilding calls this method to build a 
	// specific UFOEnemyShip
	
	protected void makeShip() {
		
		System.out.println("Making enemy ship " + getName());
		
		// The specific weapon & engine needed were passed in
		// shipFactory. We are assigning those specific part
		// objects to the UFOEnemyShip here
		
		shipFactory.addESGun();
		shipFactory.addESEngine();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}