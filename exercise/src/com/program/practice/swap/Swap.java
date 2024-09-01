package com.program.practice.swap;

public class Swap {

	public static void swapNumber(int a,int b){
		
		/* use 3rd variable
		int temp=a;
		 a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		*/
		
		//with out using 3rd variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
