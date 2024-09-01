package com.program.Static.staticfinal;

public class Main {

	public static void main(String[]args) {
		
		StaticFinal sf=new StaticFinal();
		double calculatearea=sf.calculateArea(5);
		double radius=5.0;
		
		double area =calculatearea;
		
		System.out.println("circle radius is :"+radius);
		System.out.println("circle area is :"+area);
	}
}
