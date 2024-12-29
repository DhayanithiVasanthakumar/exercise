package com.program.newfeatures.stream.usingCollection;

import java.util.ArrayList;
import java.util.List;

/*
 * as same as using array
 */

public class Test {

	public static void main(String[] args) {
		List<Integer> l =new ArrayList<Integer>();
		
		l.add(10);
		l.add(25);
		l.add(40);
		l.add(30);
		l.add(60);
		l.add(60);
		l.add(30);
		
		 l
		 //intermediate operation yethana venalu use panikalam
		.stream()
		//.count());
		.distinct()
		.sorted()
		.forEach(System.out::println);
		 
		 
		 /*
		  * decending order or user defined order
		  */
		 
		 List<String> s=new ArrayList<String>();
		 s.add("Dhaya");
		 s.add("Aswini");
		 s.add("Naren");
		 s.add("Hari");
		 
		 s
		 .stream()
		 .distinct()
		// .sorted((elem1 , elem2) -> 0)//positive-> for sort insertion order 
		 							// negative value->reverse insetrion order
		 							// 0-> for insertion order
		 
		// .sorted((elem1,elem2)->elem1.compareTo(elem2))//for ascending oder 
		 .sorted((elem1,elem2)->elem2.compareTo(elem1))//for decending oder 

		 .forEach(System.out::println);
		 
		 
		 /*
		  * using map intermediate operation
		  */
		 
		 //number
		 System.out.println("using map intermediate operation in number");
		 
		 l
		 .stream()
		 .map(no -> no/2)
		 .forEach(System.out::println);
		 
		 
		 
		 // string 
		 
		 System.out.println("using map intermediate operation in String");
		 s
		 .stream()
		 .map(name -> name +" B.E...,")
		 .forEach(System.out::println);
	}

}
