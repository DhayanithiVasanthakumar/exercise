package com.program.multithreading.Executors.methods;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Service implements Runnable {

	int i;

	public Service(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println("in thread :"+i + " ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class ExecutorUtility {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(5);
		System.out.println(new Date());

		//4
		List<Future<String>> fl=new ArrayList<>();
		
		
		for (int i = 0; i < 10; i++) {
			//1 ->execute()
			//es.execute(new Service(i));
			
			//4
			//Runnable submit vanthu future list oda object tha vagum
			//Runnable yethum return panaathu so inga null nu print aagum
			fl.add((Future<String>) es.submit(new Service(i)));
			
		}
		//2
		es.shutdown();
		//3
		es.awaitTermination(10, TimeUnit.SECONDS);//wait till here 
		
		//4
		for(Future<String> fut:fl) {
			System.out.println(fut.get());
		}
		
		System.out.println(new Date());

	}

}
