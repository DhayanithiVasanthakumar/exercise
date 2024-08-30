package com.program.collections.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEach {

	public static void main(String[] args) {
		
		/*//Array
		String[] names= {"dhaya","aswini","naren","hari"};
		
		for(String s:names) {
			System.out.println(s);
		}
		*/
		
		//ArrayList -> .add() paranthesis kula irukarathu alla Object class oda obj.not a data type
		ArrayList al=new ArrayList();
		al.add("dhaya");
		al.add("aswini");
		al.add("naren");
		al.add("hari");
		al.add(4);
		
		System.out.println("before"+al);
		/*
		//yen Object poten na add() ulla irukarathu allam obj class oda obj.
		 * forEach la particular elements ah delete pana mudiyathu so iterator use panarom.
		for(Object s:al) {
			System.out.println(s);
		}
		*/
		
		//Iterator is an interface,it allows to remove particular elements.
		Iterator i=al.iterator();
		
		while(i.hasNext()) {
			if(i.next().equals(4)) {
				i.remove();
			}
		}
		System.out.println("after :"+al);
	}

}
