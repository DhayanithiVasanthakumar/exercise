package com.program.constructor.constructoroverloadingwitharray;

public class Main {

	public static void main(String[]args){
		String[] studentArray= {"dhaya","aswini","naren","hari"};
		ClassRoom cr=new ClassRoom("mc 401",studentArray);
		cr.classRoom();
	}
}
