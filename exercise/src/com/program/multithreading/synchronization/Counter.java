package com.program.multithreading.synchronization;

//1

/*
 * scenario: 2 team vanthu avangaloda cake making count ah 
 * comman ah irukara count variable la store pananu.
 * 
 * problem:ipadi 2 team um attent time la store pana 
 * count value miss aga change iruku
 * 
 * solution:itha over come pana "synchronized" use pana
 *  oru team count pani finish panathu appram inoru team count panum
 */

public class Counter {

	private int count;
	
	public synchronized void increment() {
		count=count+1;
	}
	
	public int getCount() {
		return count;
	}
}

