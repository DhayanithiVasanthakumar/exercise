package com.program.newfeatures.function;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		Function<String,Integer> f=name -> name.length();
		System.out.println(f.apply("dhaya"));
	}
}
