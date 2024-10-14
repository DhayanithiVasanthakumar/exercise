package com.program.newfeatures.lambdaExpressions;

@FunctionalInterface
public interface Contract {
	/*
	 * FunctionalInterface can have only one abstract method
	 */
	
	//public void rule(); //-->no argument constructor
	//public void add(int a,int b);//--> for argument constructor
	public int add(int a,int b);//--> for return type
	
	/*
	 * default method
	 */
	public default void rule2() {
		
	}
	
	/*
	 * static method
	 */
	public static void rule3(){
		
	}
}
