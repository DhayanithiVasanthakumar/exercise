package com.program.multithreading.Executors.cachedThredPool;

import java.util.concurrent.TimeUnit;

public class LoopTest implements Runnable{

	private static int count=0;
	private int id;
	
	
	public LoopTest(){
		this.id=count++;
	}
	
	
	@Override
	public void run() {
		System.out.println("#### <Task"+id+"> Starting ####");
		
		for(int i=10;i>0;i--) {
			System.out.println("< "+id+" >"+"tick tick "+i);
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("#### <Task"+id+"> Completed ####");
	}
	

}