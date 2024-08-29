package com.program.collections.tostring_compare;

import java.util.ArrayList;
import java.util.Collections;

public class ToStringCompare {

	public static void main(String[]args) {
		//collection class
		Laptop dell=new Laptop(72000, 16, false);
		Laptop hp=new Laptop(65000,8,true);
		Laptop asus=new Laptop(55000,8,false);
		
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
		
		
	}
	
}
