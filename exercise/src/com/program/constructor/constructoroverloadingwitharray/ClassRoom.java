package com.program.constructor.constructoroverloadingwitharray;

public class ClassRoom {

	private String className;
	private String[] studentName;
	
	public ClassRoom(String className,String[] studentName) {
		this.className=className;
		this.studentName=studentName;
	}
	
	public void classRoom() {
		System.out.println("class name :"+className);
		System.out.println("student name :"+" ");
		for(String s:studentName) {
			System.out.println(s);
		}
		System.out.println();
	}
}
