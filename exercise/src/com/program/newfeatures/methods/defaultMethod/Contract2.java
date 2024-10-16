package com.program.newfeatures.methods.defaultMethod;

public interface Contract2 {

	/*
	 * default -> non static
	 */
	default void calculateSalary(int a,int b) {
		System.out.println("Contract 2 :"+(a-b));
	}
}
