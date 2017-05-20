package com.sapient.DesignPattern;

import javax.management.InstanceAlreadyExistsException;

import org.omg.PortableInterceptor.InvalidSlotHelper;

public class ConsoleLogger implements LogPattern {
	
	
	static ConsoleLogger instance =null;
	
	public static ConsoleLogger getInstance(){
		
		if(instance == null){
			instance = new ConsoleLogger();
		}
		return new ConsoleLogger();
	}
	private ConsoleLogger(){		
	}
	
	public void log(String message){
		System.out.println(message);
	}
	

}
