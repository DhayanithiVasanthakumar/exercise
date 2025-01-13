package com.program.multithreading.Executors.fixedThredPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {
	public static void main(String[] args) {
		System.out.println("Main thread starts ");
		//for loop la 6 task ku nu assign panitom 
		//so inga newFixedThreadPool(6) => 6 ilama 3 nu iruntha 
		//first 3 thread st aagi finish aanathu appram tha next 3 st aagi finish aagum 
		ExecutorService es=Executors.newFixedThreadPool(6);
		
		//inga i<6 ku meaning 6 task 
		for(int i=0;i<6;i++) {
			es.execute(new LoopTest());
		}
		es.shutdown();
		System.out.println("Main thread end");
	}
}
