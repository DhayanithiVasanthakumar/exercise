package com.program.multithreading.Executors.methods;

/*
 * invokeAny()
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

class ServiceCallable2 implements Callable<String> {

	int i;

	public ServiceCallable2(int i) {
		this.i = i;
	}

	@Override
	public String call() throws Exception {
		System.out.println("in thread " + i);
		return "From thread" + i;
	}

}

public class ExecutorUtility3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(5);
		System.out.println(new Date());

		// 1 Callable
		List<Callable<String>> callableList = new ArrayList<>();
		//1
		callableList.add(new ServiceCallable2(1));
		callableList.add(new ServiceCallable2(2));
		callableList.add(new ServiceCallable2(3));
		callableList.add(new ServiceCallable2(4));
		callableList.add(new ServiceCallable2(5));
	
		//2
		String str=es.invokeAny(callableList);
		
		// 3
		es.shutdown();
		// 4
		es.awaitTermination(10, TimeUnit.SECONDS);// wait till here

		System.out.println("####################");
	
		//2
		System.out.println(str);
		
		System.out.println(new Date());

	}

}
