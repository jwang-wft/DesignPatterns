package com.wang.patterns.factory;

//This is a factory thats only job is creating ships
//By encapsulating ship creation, we only have one
//place to make modifications

public class EnemyShipFactory {

	// This could be used as a static method if we
	// are willing to give up subclassing it

	public EnemyShip makeEnemyShipFromClassName(String className){
		EnemyShip ship = null;
		String classFullName = "com.wang.patterns.factory." + className;
		System.out.println("makeEnemyShipFromClassName()..." + classFullName);
		try {
			Class<?> cls = Class.forName(classFullName);
			ship = (EnemyShip) cls.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Unsupported class: " + classFullName);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return ship;
		
	}
	
	public EnemyShip makeEnemyShip(String newShipType) throws Exception {

		if (newShipType.equals("U")) {

			return new UFOEnemyShip();

		} else

		if (newShipType.equals("R")) {

			return new RocketEnemyShip();

		} else

		if (newShipType.equals("B")) {

			return new BigUFOEnemyShip();

		} else
			throw new UnsupportedShipException();

	}

}