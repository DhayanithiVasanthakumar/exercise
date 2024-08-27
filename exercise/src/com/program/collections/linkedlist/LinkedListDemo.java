package com.program.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		//offer() is same as add()
		ll.offer(5);
		ll.offer("dhaya");
		ll.offerFirst('v');
		ll.offerLast("nithi");
		System.out.println(ll);
		
		//poll(),pollFrist(),pollLast(). is same as remove()
		System.out.println("before poll"+ll);
		System.out.println(ll.poll());
		System.out.println("after poll"+ll);
		
		//clear() is used to remove all elements in entire list
		ll.clear();
		System.out.println(ll);
	}
 
}
