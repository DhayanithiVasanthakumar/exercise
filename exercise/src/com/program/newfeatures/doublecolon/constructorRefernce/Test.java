package com.program.newfeatures.doublecolon.constructorRefernce;

public class Test {

	int no;
	
	/*
	 * constructor
	 */
	public Test(int no) {
		System.out.println("Constructor "+no);
	}
	
	/*
	 * method
	 */
	public static void view(int m) {
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		
		Contract c= Test :: view;
		
		c=Test :: new;
		c.display(10000002);
	}

}
