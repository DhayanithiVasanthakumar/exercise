package com.program.collections.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		//in .add() parathesis all are objects not a primitive data types.all are non primitive
		
		al.add(10);
		al.add('c');
		al.add("dhaya");
		al.add(true);
		//to print objects
		System.out.println(al);
		//to print arraylist  size
		System.out.println(al.size());

	}

}
