package net.RPower.RPowermod.core;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class LogHelper {
	private static Logger logger;

	public static void init(Logger loggerMod) {
		logger = loggerMod;
	}

	public static void info(String message) {
		logger.info(message);
	}

	public static void debug(String message) {
		logger.debug(message);
	}

	public static void log(Level logLevel, String message) {
		logger.log(logLevel, message);
	}
}