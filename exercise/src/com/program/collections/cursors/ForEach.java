package com.program.collections.cursors;

import java.util.ArrayList;

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
		
		System.out.println(al);
		//yen Object poten na add() ulla irukarathu allam obj class oda obj.
		for(Object s:al) {
			System.out.println(s);
		}
	}

}
