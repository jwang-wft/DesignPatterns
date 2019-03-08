package com.wang.cleancode.loggertest;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.Before;
import org.junit.Test;

public class LogTest {
	private Logger logger;

	@Before
	public void setUp() throws Exception {
		logger = Logger.getLogger("LogTest");
		logger.removeAllAppenders();
		Logger.getRootLogger().removeAllAppenders();
	}

	@Test
	public void basicLogger() {
		BasicConfigurator.configure();
		logger.info("basicLogger");
		assertTrue(logger instanceof Object);
	}

	@Test
	public void addAppenderWithStream() {
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %m(%l)%n"),ConsoleAppender.SYSTEM_OUT));
		logger.info("addAppenderWithStream");
		assertTrue(logger instanceof Logger);
	}

	@Test
	public void addAppenderWithoutStream() {
		logger.addAppender(new ConsoleAppender(new PatternLayout("%p %m(%L)%n")));
		logger.info("addAppenderWithoutStream");
	}
}
