package com.program.multithreading.Executors.methods;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class ServiceCallable implements Callable<String> {

	int i;

	public ServiceCallable(int i) {
		this.i = i;
	}

	

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		System.out.println("in thread "+i);
		return "From thread"+i;
	}

}

public class ExecutorUtility2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(5);
		System.out.println(new Date());

		// 4
		List<Future<String>> fl = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			// 1 ->execute()
			// es.execute(new Service(i));

			// 4
			// Runnable submit vanthu future list oda object tha vagum
			// Runnable yethum return panaathu so inga null nu print aagum
			fl.add(es.submit(new ServiceCallable(i)));

		}
		// 2
		es.shutdown();
		// 3
		es.awaitTermination(10, TimeUnit.SECONDS);// wait till here
		
		System.out.println("####################");
		// 4
		for (Future<String> fut : fl) {
			System.out.println(fut.get());
		}

		System.out.println(new Date());

	}

}
