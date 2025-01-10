package com.program.multithreading;

public class MainThread {

	public static void main(String[] args) {
		ChildThread ct=new ChildThread();
		ct.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("Main thread "+i);
		}
	}

}
