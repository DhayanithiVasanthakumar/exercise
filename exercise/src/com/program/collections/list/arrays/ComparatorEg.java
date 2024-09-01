package com.program.collections.list.arrays;

import java.util.Comparator;

public class ComparatorEg implements Comparator{

	@Override
	//Object is a class of all classes
	public int compare(Object o1, Object o2) {
		/*
		 * type casting: Object to String
		 */
		String s1=(String)o1;
		String s2=(String)o2;
		
		//compareTo() return data type is int.
		
		/*
		 * ascending order na 
		 * return +1
		 * return -1
		 * return 0
		 * 
		 * decending order na
		 * return -1
		 * return +1
		 * return 0
		 */
		
		/* decending order
		 * compareTo() direct ah if la use pana mudiyathu. athoda result tha if la us epana mudiyum
		 * yena if return only int
		 
		int result=s1.compareTo(s2);
		
		if(result>0)
			return -1;
		else if(result<0)
			return +1;
		else
			return 0;
		*/
		
		
		//length wise -> ascending,decending.
		if(s1.length()>s2.length()) {
			return -1;
		}
		else if(s1.length()<s2.length()) {
			return +1;
		}
		else
			return 0;
			
					
	}

}
