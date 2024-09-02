package com.program.collections.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		//add entry
		hm.put("dhaya",8);
		hm.put("aswini", 21);
		hm.put("naren", 98);
		
		//display a entry
		System.out.println("key + values are :"+hm);
		
		//print only keys
		Set s=hm.keySet();
		System.out.println("keys are :"+s);
		
		//print only values
		Collection c=hm.values();
		System.out.println("values are :"+c);
		
		//print entrys
		Set en=hm.entrySet();
		System.out.println("entries are :"+en);
		
		//thani thani ya print panum
		Iterator i=en.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
	}
}