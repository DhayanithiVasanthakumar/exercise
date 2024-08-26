package com.program.factorial;

public class Factorial {
	public int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
	}
	
	public void factorialLoop(int num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		System.out.println(f);
	}
}
