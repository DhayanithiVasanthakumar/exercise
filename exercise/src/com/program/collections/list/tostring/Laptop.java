package com.program.collections.list.tostring;

public class Laptop {

	String name;
	int price;
	int ram;
	boolean screen;
	
	//to override a toString(). toString() is alreday in Object class so to override a method for my convinience
	//ithanaala hasscode print panarathuku bathil ah String ah print aagum
	public String toString() {
		return " : "+this.name+" : "+this.price+" : "+this.ram+" : "+this.screen;
	}
	
	public Laptop(String name,int price,int ram,boolean screen) {
		this.name=name;
		this.price=price;
		this.ram=ram;
		this.screen=screen;
	}
	
}
