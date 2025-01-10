package com.program.multithreading;

public class MainThread {

	public static void main(String[] args) {
		ChildThread ct=new ChildThread();
		ct.start();
		
	
		
		for(int i=0;i<=5;i++) {
			System.out.println("Main thread "+i);
		}
		
		//getClass() method
		System.out.println(ct.getName());
		//setClass() method
		ct.setName("check class");
		System.out.println(ct.getName());
		
		System.out.println(ct.getPriority());
		ct.setPriority(1);
	}

}
