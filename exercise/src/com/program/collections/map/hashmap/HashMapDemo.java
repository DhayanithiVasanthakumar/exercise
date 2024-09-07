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
		
		//entry ya thani thani obj ah  print panum
		Iterator i=en.iterator();
		/*
		while(i.hasNext()) {
			//next() it is a object ithu obj obj ah tha print panum
			System.out.println(i.next());
		}
		*/
		
		while(i.hasNext()) {
			//next() ah Map.Entry object ah type cast pani key thaniya value thani ya  print pana mudiyum
			Map.Entry me=(Map.Entry)i.next();
			//System.out.println("keys are :"+ me.getKey()+",  values are :"+me.getValue());
			
			//to check obj
			if(me.getKey().equals("dhaya")) {
				//dhaya oda key value mattum print panum
				//System.out.println(" values are :"+me.getValue());
				
				//antha value ku bathil ah vera set pananum na setValue()
				me.setValue(10);
			}
			System.out.println(me);
		}
		
	}
}