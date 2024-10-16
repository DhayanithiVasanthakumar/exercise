package com.program.newfeatures.stream;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] ar= {10,6,3,7,9};
		
		Arrays.stream(ar)
		.sorted()
		.forEach(System.out::println);

	}

}
