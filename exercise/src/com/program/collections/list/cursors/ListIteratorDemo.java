package com.program.collections.list.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("dhaya");
		al.add("aswini");
		al.add("naren");
		al.add("hari");
		al.add(4);
		
		System.out.println("before"+al);

		ListIterator li=al.listIterator();
		//amma tha frist add aagum because cursor frist la irunthu tha st aagum
		li.add("amma");
		
		while(li.hasNext()) {
			if(li.next().equals(4)) {
				//set used to set a object
				li.set(44);
			}
		}
		System.out.println("after :"+al);

	}

}
