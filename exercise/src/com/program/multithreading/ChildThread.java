package com.program.multithreading;

public class ChildThread extends Thread{

	//run() method is overriden in this class .
	//because run() method is one of the method in Thread class
	public void run(){
		for(int i=0;i<=5;i++) {
			//yield() defines currently ecxecuting thread giving its chances to other threads
			Thread.yield();
			System.out.println("Child thread "+i);
		}
	}
}
