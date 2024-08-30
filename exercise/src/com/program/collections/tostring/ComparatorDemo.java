package com.program.collections.tostring;

import java.util.Comparator;

public class ComparatorDemo implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//ithu Object class obj ah iruku so itha type cast pani namba class obj ah change panaum
		
		
		//arrays package la inga String class obj ah change pananom.->refer collectios.arrays
		//ipa ithu Laptop class obj ah change agiduchi
		Laptop l1=(Laptop)o1;
		Laptop l2=(Laptop)o2;
		
		
		/*//to compare string use compareTo(). 
		 * ithoda return type is int so atuku oru variable create pani store pani if la boolean output ah tham
		
		int result=l1.name.compareTo(l2.name);
		
		if(result>0)
			return +1;
		else if(result<0)
			return -1;
		return 0;
		
		*/
		
		if(l1.price<l2.price) 
			return -1;
		else if(l1.price>l2.price)
			return +1;
		else
			if(l1.ram<l2.ram)
				return -1;
			else if(l1.ram>l2.ram)
				return +1;
			else
			return 0;
		
	}
	
}
