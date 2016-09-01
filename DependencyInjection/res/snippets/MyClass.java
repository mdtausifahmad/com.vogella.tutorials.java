package com.example.e4.rcp.todo.parts;

import java.util.logging.Logger;

public class MyClass {
	
	private final static Logger logger;
	
	public MyClass(Logger logger) {
		this.logger = logger;
		// write an info log message
		logger.info("This is a log message.")
	}
}