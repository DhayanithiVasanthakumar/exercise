package com.program.newfeatures.forEach;

import java.util.Arrays;
import java.util.List;

public class Test {

	/*
	 * forEach is as same as enhance for loop 
	 * defenition -> check note
	 */
	public static void main(String[] args) {
		List<Integer> l= Arrays.asList(10,5,6,95);
		
		l.forEach(no -> System.out.println(no));
	}
}
