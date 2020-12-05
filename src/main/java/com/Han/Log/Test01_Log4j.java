package com.Han.Log;

import org.apache.log4j.Logger;

public class Test01_Log4j {
	
	//必须搭配log4j.properties文件才能运行
	private static Logger logger = Logger.getLogger(Test01_Log4j.class);
	
	public static void main(String[] args) {
		logger.trace("Trace Message");
		logger.debug("Debug Message");
		logger.info("Info Message");
		logger.warn("Warnning");
		logger.error("Error");
		logger.fatal("Fatal!");
		
		logger.error("Exception", new NullPointerException("Null Pointer Exception"));
		
	}
}
