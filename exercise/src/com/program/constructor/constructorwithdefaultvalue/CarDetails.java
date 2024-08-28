package com.program.constructor.constructorwithdefaultvalue;

/*
 * Constructor with Default Values
 
Write a Java program to create a class called Car with instance variables make, model, and year. 
Implement a parameterized constructor that initializes these variables and 
assigns default values if not provided. Print the values of the variables.
 */

public class CarDetails {
	private String company;
	private String model;
	private int year;
	
	public CarDetails(String company,String model,int year) {
		this.company=(company == null ||company.isEmpty())?"unknown company":company;
		this.model=(model == null ||model.isEmpty())?"unknown model":model;
		this.year=(year<=1950)?2000:year;
	}
	
	public void carDetails() {
		System.out.println("Company name is :"+ company);
		System.out.println("model number is :"+model);
		System.out.println("year is :"+year);
	}
}
