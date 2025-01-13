package com.program.multithreading.Executors.methods;

/*
 * invokeAll() 
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class ServiceCallable3 implements Callable<String> {

	int i;

	public ServiceCallable3(int i) {
		this.i = i;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		System.out.println("in thread " + i);
		return "From thread" + i;
	}

}

public class ExecutorUtility4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(5);
		System.out.println(new Date());

		// 4
		List<Callable<String>> callableList = new ArrayList<>();
		//1
		callableList.add(new ServiceCallable2(1));
		callableList.add(new ServiceCallable2(2));
		callableList.add(new ServiceCallable2(3));
		callableList.add(new ServiceCallable2(4));
		callableList.add(new ServiceCallable2(5));
	
		List<Future<String>> futureList = es.invokeAll(callableList);
		
		// 2
		es.shutdown();
		// 3
		es.awaitTermination(10, TimeUnit.SECONDS);// wait till here

		System.out.println("####################");
		// 4
		for (Future<String> fut : futureList) {
			System.out.println(fut.get());
		}

		System.out.println(new Date());

	}

}
