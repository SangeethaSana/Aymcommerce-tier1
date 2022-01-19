package com.aymcommerce.pg.clubpampers.log.listener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class RuntimeLoggerListner {
	private static Logger logger = LogManager.getLogger(RuntimeLoggerListner.class);

	public static void logInstanceFire() {
		DOMConfigurator.configure("resources/logger.xml");
	}

	public static void logDetails(String log) {
		logger.info(log);
	}

	public static void logDetail(String log) {
		logger.info(log);
	}

	public static void logDetailBreak() {
		logger.info("-----------------------------------------------------------------------------");
	}
}
