package com.program.constructor.catdetails;

/*
 * cat details
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
