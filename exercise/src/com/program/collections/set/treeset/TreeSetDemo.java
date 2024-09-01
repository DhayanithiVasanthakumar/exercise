package com.program.collections.set.treeset;

import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[]args) {
		
		LinkedList ll=new LinkedList();
		ll.add(15);
		ll.add(65);
		ll.add(98);
		ll.add(65);
		ll.add(69);
		
		System.out.println("Before :"+ll);
		
		TreeSet ts=new TreeSet(ll);
		System.out.println("after :"+ts);
		
		/* TreeSet remove duplicates and sort in ascending order.
		TreeSet ts=new TreeSet();
		ts.add(15);
		ts.add(98);
		ts.add(64);
		ts.add(19);
		ts.add(15);
		ts.add(18);
			
			
			
		
		System.out.println(ts);
		*/
	}
}
