package com.program.collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayListSorting {
	public static void main(String[]args) {
		//ascending order
		
		//primitive data type
		int[] arr= {1,5,9,7,3,4,6,2,8,0};
		
		for(int i:arr) {
			System.out.println(i);
		}
		//In primitive data type .sort(primitive[] arr)
		Arrays.sort(arr);
		
		System.out.println("after sorting");
		for(int i:arr) {
			System.out.println(i);
		}
		
		
		//non primitive data type 
		String[] names= {"dhaya","naren","hari","asu","partha","pranesh"};
		
		for(String s:names) {
			System.out.println(s);
		}
		
		
		// In non primitive data type .sort(Object[] s) 
		Arrays.sort(names);
		System.out.println("after sorting");
		
		for(String s:names) {
			System.out.println(s);
		}
		
		//ascending order based on string length. so use comparator
		
		Comparator comp=new ComparatorDemo();
		Arrays.sort(names,comp);
		
		System.out.println("****after compare method usage****");
		
		for(String s:names) {
			System.out.println(s);
		}
		
		
		
		
	}
	
}
