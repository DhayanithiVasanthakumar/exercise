package com.program.constructor;

public class StudentDetails {

	private String name;
	private int age;
	private long phno;
	private String email;
	
	public StudentDetails(String stu_name,int stu_age,long stu_phno,String stu_email) {
		this.name=stu_name;
		this.age=stu_age;
		this.phno=stu_phno;
		this.email=stu_email;
	}
	//name
	public String getName() {
		return name;
	}
	public String setName() {
		return name;
	}
	
	//age
	public int getAge() {
		return age;
	}
	public int setAge() {
		return age;
	}
	
	//phno
	public long getPhno() {
		return phno;
	}
	public long setPhno() {
		return phno;
	}
	
	//email
	public String getEmail() {
		return email;
	}
	public String setEmail() {
		return email;
	}
	
	public void displayDetails() {
		System.out.println("Student name is :"+name);
		System.out.println("Student age is :"+age);
		System.out.println("Student phno is :"+phno);
		System.out.println("Student email is :"+email);
	}
	
}
