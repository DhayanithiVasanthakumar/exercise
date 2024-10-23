package com.program.newfeatures.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		
		int[] ar= {10,6,3,7,9};
		
		/*
		 * both are same program
		 */
		
		/*  
		 * bad approch
		
		IntStream s=Arrays.stream(ar);
		IntStream s2 =s.sorted();
		s2.forEach(no -> System.out.println(no));
		
		 */
	
	
		/*
		 * good approch follow this type
		 */
		Arrays.stream(ar)
		.sorted()
		.forEach(System.out::println);
		
		
	}

}
