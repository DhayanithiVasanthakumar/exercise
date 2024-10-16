package com.program.newfeatures.methods.defaultMethod;

public interface Contract1 {

	/*
	 * default -> non static
	 */
	default void calculateSalary(int a,int b) {
		System.out.println("Contract 1 :"+(a+b));
	}
}
