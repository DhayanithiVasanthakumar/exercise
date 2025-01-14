package com.program.newfeatures.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

	public void usingAnonymousStyle() {
		Consumer<String> printthis = new Consumer<String>() {

			@Override
			public void accept(String input) {
				System.out.println(input);
			}
		};
		printthis.accept("hello from anonymous style");
	}

	public void lambdaStyle() {
		Consumer<String> consumer1 = (input) -> System.out.println(input+"is a word");
		//consumer1.accept("hello from lambda style");
		
		Consumer<String> consumer2 = (input) -> System.out.println(input+"yepadi iruka is emotion");
		//use andThen();
		
		consumer1.andThen(consumer2).accept("vanakam");

	}

	public static void main(String[] args) {
		ConsumerExample ce = new ConsumerExample();
		//ce.usingAnonymousStyle();
		ce.lambdaStyle();
	}

}
