package com.program.newfeatures.lambdaExpressions;

public class Test {

	public static void main(String[] args) {
		//call functional interface
		/*
		 * for no argument constructor
		 */
		//Contract cc=()->{ System.out.println("Hi"); };
		//cc.rule();
		
		/*
		 * for argument constructor
		 */
		//Contract cc=(a,b)->{System.out.println(a+b);};
		//cc.add(10, 20);
		
		/*
		 * for return type constructor
		 */
		Contract cc=(a,b) -> { 
			return (a+b);
		};
		System.out.println(cc.add(100, 20));
	}

}
