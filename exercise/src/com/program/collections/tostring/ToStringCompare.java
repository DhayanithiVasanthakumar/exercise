package com.program.collections.tostring;

import java.util.ArrayList;
import java.util.Collections;

public class ToStringCompare {

	public static void main(String[]args) {
		//collection class
		Laptop dell=new Laptop("g 15",72000, 16, false);
		Laptop hp=new Laptop("pavilion",+55000,8,true);
		Laptop asus=new Laptop("asus",+55000,12,false);
		
		ArrayList laptoplist=new ArrayList();
		laptoplist.add(dell);
		laptoplist.add(hp);
		laptoplist.add(asus);
		
		//itha use pana yepadi sort pananum nu theriyathu so Comparator class use pani namaku  yetha mari sort panarom
		//Collections.sort(laptoplist);
		
		System.out.println("Before sort"+laptoplist);
		//use Comparator for namaku yetha maari sort panikalam
		ComparatorDemo cd=new ComparatorDemo();
		Collections.sort(laptoplist, cd);
		System.out.println("After sort"+laptoplist);
		
		//reverse pananum na 
		
		Collections.reverse(laptoplist);
		System.out.println("after reverse"+laptoplist);
		
	}
	
}