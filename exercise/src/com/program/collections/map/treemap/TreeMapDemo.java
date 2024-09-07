package com.program.collections.map.treemap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tm= new TreeMap();
		tm.put(100, "dhaya");
		tm.put(101,"aswini");
		
		//put all is same as addAll()->copy of specific list.
		TreeMap tm2=new TreeMap();
		tm2.putAll(tm);
		System.out.println(tm2);
		
		//order ah maintain panarathu naala fristkey(),lastKey(),fristEntry()... irukum 
	}

}
