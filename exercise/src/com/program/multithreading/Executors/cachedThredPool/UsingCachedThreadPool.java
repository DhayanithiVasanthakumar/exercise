package com.program.multithreading.Executors.cachedThredPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCachedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main thread starts ");
		ExecutorService es = Executors.newCachedThreadPool();

		// inga i<3 ku meaning 3 task
		for (int i = 0; i < 3; i++) {
			es.execute(new LoopTest());
		}
		es.shutdown();
		System.out.println("Main thread end");
	}
}
