package com.program.newfeatures.methods.defaultMethod;

public class Employee implements Contract1,Contract2 {

	public static void main(String[] args) {
		Employee em=new Employee();
		em.calculateSalary(1000, 2200);
	}

	/*
	 * default method(non static method) -> override panalam
	 * static method tha override pana mudiyathu
	 */
	@Override  
	public void calculateSalary(int a, int b) {
		Contract1.super.calculateSalary(a, b);
		Contract2.super.calculateSalary(a, b);
		
	}
	
	
}
