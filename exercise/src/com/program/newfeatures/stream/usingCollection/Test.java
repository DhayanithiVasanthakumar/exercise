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
		 s.add("abce");
		 s.add("bvecd");
		 s.add("newwjgfuj");
		 s.add("defghkk");
		 
		 s
		 .stream()
		 .distinct()
		// .sorted((elem1 , elem2) -> 0)//positive-> for sort insertion order 
		 							// negative value->reverse insetrion order
		 							// 0-> for insertion order
		 
		// .sorted((elem1,elem2)->elem1.compareTo(elem2))//for ascending oder 
		 .sorted((elem1,elem2)->elem2.compareTo(elem1))//for decending oder 

		 .forEach(System.out::println);
	}

}
