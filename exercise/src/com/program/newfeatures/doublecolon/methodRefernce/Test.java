package com.program.newfeatures.doublecolon.methodRefernce;

public class Test {
	
	public void show(int m) {
		System.out.println(m);
	}

	public static void main(String[] args) {
		Test t=new Test();
		
		/*
		 * num -> System.out.println(num)  --> ithu display oda definition
		 * ithu ku thani ya write pana theva illa yenoda class la show oda definition ah yeduthuko nu ipadi solarom
		 */
		//Contract c=num -> System.out.println(num);
		
		Contract c=t :: show;
		c.display(15);
	}
}
