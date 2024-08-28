package com.program.constructor.defaultconstructor;

/*
 	Write a Java program to create a class called "Cat" with instance variables name and age. 
 	Implement a default constructor that initializes the name to "Unknown" and the age to 0.
 	 Print the values of the variables
 */
public class CatDetails {
	private String name;
	private int age;
	
	public CatDetails() {
		this.name="meaw";
		this.age=10;
	}
	
	public void catDetails() {
		System.out.println(name);
		System.out.println(age);
	}
}
