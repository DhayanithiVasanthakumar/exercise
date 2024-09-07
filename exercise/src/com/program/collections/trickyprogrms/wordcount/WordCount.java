package com.program.collections.trickyprogrms.wordcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		
		String name= "tamil english maths tamil";
		//string ah string array ah change pananum na use split() 
		String[] words=name.split(" ");
		
		HashMap <String,Integer> wordCountMap=new HashMap();
		
		for(String s:words) {
			if(wordCountMap.containsKey(s)) {
				wordCountMap.put(s, wordCountMap.get(s)+1);
			}
			else {
				wordCountMap.put(s, 1);
			}
		}
		System.out.println(wordCountMap);
		
		//count unique,count duplicate  
				//entrySet()-> thani thani entry ah kudukum
				//entrySet() return datatype is Set<Map.Entry<Character, Integer>>
				Set<Map.Entry<String, Integer>> se =wordCountMap.entrySet();
				
				for(Map.Entry<String, Integer> entry:se) {
					
					//duplicate
					//if(entry.getValue()>1)
					
					//unique
					if(entry.getValue()==1)
					System.out.println(entry.getKey()+" : "+entry.getValue());
				}
	}
}
