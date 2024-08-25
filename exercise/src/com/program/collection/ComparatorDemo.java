package com.program.collection;

import java.util.Comparator;


// Comparator used to compare an object
public class ComparatorDemo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		//type casting
		//toString() is convert one data type to string data type
		//both type casting are same
		String s1=o1.toString();
		String s2=(String)o2;
		
		//it for ascending order length
		//if want to change decending order length.to change the return -1;return +1
		if(s1.length() > s2.length()) 
			return +1;
		else if(s1.length() < s2.length())
			return -1;
		else
			return 0;
		
		 
		/*  decending order length
		  if(s1.length() > s2.length()) 
			return -1;
		else if(s1.length() < s2.length())
			return +1;
		else
			return 0;
		 */
	}

}
