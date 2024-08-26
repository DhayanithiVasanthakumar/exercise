package com.program.arrays;

import java.util.Arrays;

/*
 * in this program we done
 * 
 * 2 arrays are equals or not
 * ascending
 * decending
 * based on length(ascending,decending )
 */

public class ArraysDemo {
	
	public static void main(String[]args) {
		
		//primitive data type 
		int[] a1= {10,20,30};
		int[] a2= {10,20,30};
		
		/*
		 *  .equals() return only 2 posible values but compare 2 obj only
		 */
		boolean same=Arrays.equals(a1, a2);
		System.out.println(same);
		
		/*
		 * .compareTo() return 3 posible values but compare 2 obj only
		 * 
		 */
		
		//non primitive data type
		
		//it for ascending order
		String[] names= {"dhaya","aswini","naren","hari","partha","pranesh"};
		Arrays.sort(names);
		System.out.println("***ascending order by using sort()***");
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		/*if want to change order ie,desending,based on length,etc.. so use Comparator
		 *Comparator() used to compate 2 obj in this program obj are names and ce.
		 */
		ComparatorEg ce=new ComparatorEg();
		Arrays.sort(names, ce);
		System.out.println("***using comparator interface***");
		//decending order
		//based on length ->ascending,decending.
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}
	
}
