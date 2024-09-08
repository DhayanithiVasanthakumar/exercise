package com.program.collections.generics;

import java.util.TreeSet;

public class GenericsDemo {

	public static void main(String[] args) {
		
		//in Array is datatype is  safe
		//compile time la ye error show aaum
		int[] arr=new int[4];
		arr[0]=5;
		arr[1]=55;
		arr[2]=9;
		arr[3]=8;
		
		
		/*
		//in collections datatype is not safe
		//ithu run time la tha error show aagum 
		TreeSet ts=new TreeSet();
		ts.add(15);
		ts.add(65);
		ts.add(1.2);
		//it throw ClassCastException 
		System.out.println(ts);
		*/
		
		//collection la intha disadvantage irukarathu naala generic use pananga
		//it is datatype safe
		//compile time la ye error show aaum
		//< > -> ula non primitive datatype tha tharanum.
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(15);
		ts.add(65);
		//generics use panathu naala inga ye error show aagum
		ts.add(1.2); 
		System.out.println(ts);
	}

}
