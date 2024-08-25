package com.program.collection;

import java.util.Arrays;

public class ArrayListSorting {
	public static void main(String[]args) {
		
		int[] arr= {1,5,9,7,3,4,6,2,8,0};
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		Arrays.sort(arr);
		
		System.out.println("after sorting");
		for(int i:arr) {
			System.out.println(i);
		}
		
		String[] str= {"dhaya","naren","hari","asu","partha","pranesh"};
		
		for(String s:str) {
			System.out.println(s);
		}
		
		
		
		Arrays.sort(str);
		System.out.println("after sorting");
		
		for(String s:str) {
			System.out.println(s);
		}
	}
}
