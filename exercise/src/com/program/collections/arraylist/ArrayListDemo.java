package com.program.collections.arraylist;

import java.util.ArrayList;

import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		//in .add() parathesis all are objects not a primitive data types.all are non primitive
		
		al.add(10);
		al.add('c');
		al.add("dhaya");
		al.add(true);
		//to add specific index
		al.add(3, "aswini");
		//to print objects
		System.out.println(al);
		//to print arraylist  size
		System.out.println(al.size());
		//to check the obj present in string or not
		System.out.println(al.contains("dhaya"));
		//to get specific  obj at specifix index
		System.out.println(al.get(0));
		//to remove specific obj  at specifix index
		System.out.println(al.remove(1));
		System.out.println(al);
		//to set a particular obj at particular index.
		System.out.println(al.set(1,'l'));
		System.out.println(al);
		//to find obj at specifix index
		System.out.println(al.indexOf("aswini"));
		
		//copy of old array
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		System.out.println("al2 list is "+al2);
		
		//create an new array list
		ArrayList al3=new ArrayList();
		al3.add("chennai");
		al3.add("salem");
		al3.add("erode");
		al3.add("karur");
		System.out.println("al3 list is "+al3);
		
		//add one array on another array
		al3.add(2, al);
		System.out.println("al3 after addition is"+al3);
		
		//remove specific arraylist
		al3.remove(al);
		System.out.println("al3 after remove() s"+al3);
		
		//print one specific index to another
		System.out.println(al3.subList(0, 2));
		
		List al4=al3.subList(0, 3);
		System.out.println("al4 list is "+al4);
	}

}
