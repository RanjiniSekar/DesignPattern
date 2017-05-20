package com.sapient.DesignPattern;

import java.lang.reflect.Constructor;
import java.util.logging.Logger;

public class LoggerInnerClassSingletonDemo {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,IllegalArgumentException{
		ConsoleLogger logger =  ConsoleLogger.getInstance();
		logger.log("Test");
		for(Constructor<T> constructor : LoggerLazyThreadSafeSingleton.class.getDeclaredAnnotations()){
			constructor.setAccessible(true);
			
		}
		
		
	}

}
