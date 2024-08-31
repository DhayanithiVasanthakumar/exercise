package com.program.Static.staticvariable;

public class CounterVariable {
	
	private static int count=0;
		
	public CounterVariable() {
		count++;
	}
	
	public static int countVariable() {
		return count;
	}
}
