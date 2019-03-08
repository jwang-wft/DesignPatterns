package com.wang.patterns.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EnemyShipFactoryTest {
	EnemyShipFactory enemyShipFactory;
	@Before
	public void setUp() throws Exception {
		enemyShipFactory = new EnemyShipFactory();
	}

	@Test
	public void enemyShipFactory_makeUEnemyShip_returnTrue() {
		EnemyShip es = null;
		try {
			es = enemyShipFactory.makeEnemyShip("U");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(es instanceof UFOEnemyShip);
	}

	@Test(expected=UnsupportedShipException.class)
	public void enemyShipFactory_throwsExeptionForUnsupportShip() throws Exception{
			enemyShipFactory.makeEnemyShip("WQ");
	}
	
}
