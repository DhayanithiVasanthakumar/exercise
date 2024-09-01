package com.program.collections.list.binarysearch;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("d");
		al.add("h");
		al.add("a");
		al.add("y");
		al.add("a");
		
		System.out.println("normal order"+al);
		//ascending order
		//decending ->comparator use pananum
		Collections.sort(al);
		System.out.println("asscending order :"+al);
		
		//binary search->sort panathu appram tha binary search use pana mudiyum.
		
		//(Sucessfull search)->irukara list la intha obj iruntha crt position show panum
		System.out.println(Collections.binarySearch(al, "d"));
		//(unSucessfull search)->irukara list la intha obj ila na athu yentha  position la irukananum nu show panu panum
		System.out.println(Collections.binarySearch(al, "f"));
		
		
		
	}

}
