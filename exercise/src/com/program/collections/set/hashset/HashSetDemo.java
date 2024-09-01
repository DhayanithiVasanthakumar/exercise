package com.program.collections.set.hashset;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[]args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(5);
		hs.add(68);
		hs.add(10);
		hs.add(70);
		hs.add(168);
		hs.add(190);
		//it doesnot print because it is duplicate.
		System.out.println(hs.add(100));
		
		System.out.println(hs);
	}
}
