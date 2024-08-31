package com.program.Static.staticvariable;

/*
 * Write a Java program to create a class called "Counter" with a static variable count. 
 * Implement a constructor that increments count every time an object is created.
 *  Print the value of count after creating several objects.
 */

public class CounterVariable {
	
	private static int count=0;
		
	public CounterVariable() {
		count++;
	}
	
	public static int countVariable() {
		return count;
	}
}
