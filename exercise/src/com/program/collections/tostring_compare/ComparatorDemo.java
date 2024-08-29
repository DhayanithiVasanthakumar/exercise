package com.program.collections.tostring_compare;

import java.util.Comparator;

public class ComparatorDemo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//ithu Object class obj ah iruku so itha type cast pani namba class obj ah chane panaum
		
		
		//arrays package la inga String class obj ah change pananom.->refer collectios.arrays
		//ipa ithu Laptop class obj ah change agiduchi
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		
		if(l1.price<l2.price) 
			return +1;
		if(l1.price>l2.price)
			return -1;
	
			return 0;
		
	}
	
}
