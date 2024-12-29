package com.program.newfeatures.stream.miniProject;

import java.util.ArrayList;

public class StreamDemo {

	public static void main(String[] args) {

		ArrayList<Employee> al=new ArrayList<Employee>();
		
		Employee e1=new Employee("Dhaya", 100, 2, 25000);
		Employee e2=new Employee("Aswini",101,5,75000);
		Employee e3=new Employee("Naren",102,5,80000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		//eg 1 -> get name
		System.out.println("Names are...");
		al
		.stream()
		.map(emp -> emp.getName())
		.forEach(System.out::println);
		
		System.out.println(".............");
		
		//eg 2 -> get name based on salary condition
		System.out.println("get name based on salary condition");
		
		al
		.stream()
		.filter(sal ->sal.getSalary() >50000)
		.map(emp -> emp.getName())
		.forEach(System.out::println);
		
		System.out.println(".............");

	}

}
