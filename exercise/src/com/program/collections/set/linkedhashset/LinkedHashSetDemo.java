package com.program.collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[]args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add(46);
		lhs.add(92);
		lhs.add(67);
		lhs.add(34);
		lhs.add(190);
		//does not allow duplicate
		System.out.println(lhs.add(100));
		
		System.out.println(lhs); 
		
	}
}
