package com.program.collections.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.LinkedList;

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
		
		//power of linkedhashset is ->  eg program:remove duplicate
		
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(10);
		ll.add(40);
		ll.add(20);
		
		System.out.println("before remove"+ll);
		
		
		LinkedHashSet lhs2=new LinkedHashSet(ll);
		System.out.println("after remove :"+lhs2);
		
		
		//convert list,set... onto an array
		Object[] ob=ll.toArray();
		//array va print pana for each use panare
		System.out.println("converted array :");
		for(Object o:ob) {
			System.out.println(o);
		}
		
	}
	
}
