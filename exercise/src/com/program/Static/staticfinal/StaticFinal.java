package com.program.Static.staticfinal;

/*
 * Static Final Variables
Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159.
 Create a method to calculate the area of a circle given its radius, using the 'PI' constant.
  Demonstrate the method in the main method.
 */

public class StaticFinal {

	public static final double pi=3.14159;
	
	public double calculateArea(double radius) {
		return pi*radius*radius;
	}
}
