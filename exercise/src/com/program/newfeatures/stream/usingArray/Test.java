package com.program.newfeatures.stream.usingArray;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		
		int[] ar= {10,6,3,7,6,9};
		
		/*
		 * both are same program
		 */
		
		/*  
		 * bad approch
		
		IntStream s=Arrays.stream(ar);
		IntStream s2 =s.sorted();
		s2.forEach(no -> System.out.println(no));
		
		 */
	
		
	
		/*
		 * good approch follow this type
		 */
		//Arrays
		//.stream(ar)  //intermediate operation
		//.sorted()		//intermediate operation
		//.forEach(System.out::println);  //terminal operation
		
		/*
		 * some another intermediate operations 
		 */
		//find max
		
		OptionalInt oi=Arrays
							.stream(ar)
							.max();//in this use any aggregate operations like (min,max,avg,sum,count)
		System.out.println("max ="+oi.getAsInt());
		
		
		//find average
		OptionalDouble od=Arrays
				.stream(ar)
				.average();//in this use any aggregate operations like (min,max,avg,sum,count)
		System.out.println("average ="+od.getAsDouble());

		//find count
		
		long l=Arrays
				.stream(ar)
				.count();//in this use any aggregate operations like (min,max,avg,sum,count)
		System.out.println("count ="+l);

		//unique value
		System.out.println("unique");
		Arrays 
		.stream(ar)
		.distinct()
		//.forEach(el -> System.out.println("Unique"+el));
		.forEach(System.out::println);
		
		//filter()
		System.out.println("Filter operations");
		Arrays
		.stream(ar)
		//it is multiple of 2
		.filter(no ->no%2==0)//inga yena maari ana function vennalu panalam like (find even number ,odd number)
		.forEach(System.out::println);
	}

}
