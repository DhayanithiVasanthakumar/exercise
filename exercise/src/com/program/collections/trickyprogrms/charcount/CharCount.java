package com.program.collections.trickyprogrms.charcount;

import java.util.HashMap;

public class CharCount {

	public static void main(String[] args) {
		String s="malayalam";
		
		HashMap<Character,Integer> charcountmap=new HashMap();
		//inga yentha char um irukathu
		System.out.println(charcountmap);
		
		char ch[]=s.toCharArray();
		for(char c:ch) {
			// here c-> m a l a y a l a m
			//frist tharava charcountmap la pooi paakum . c la yethu ila so else ku poogum
			//c la value iruntha antha char oda one plus aagum.
			//m=2,a=4,l=2,y=1 ipadi
			if(charcountmap.containsKey(c)) {
				charcountmap.put(c,charcountmap.get(c)+1);
			}
			else {
				//yethu ilana c la antha char(m,a,l,y) ku 1 nu store aagum.
				//m=1,a=1,l=1,y=1 ipadi
				charcountmap.put(c, 1);
			}
		}
		System.out.println(charcountmap);
	}
}