package com.program.filehandling;

import java.io.File;
//topic 1
public class CreateFolder {
	public static void main(String[]args) {
		
		/*
		 *create main folder
		File file=new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle");
		
		//to check the Folder present in the given path
		boolean present=file.exists();
		System.out.println("Folder Present  "+present);
		
		//if not create file using mkdir() method.
		if(present==false) {
			file.mkdir();
			
		present=file.exists();
		System.out.println("Folder Present  "+present);
		}
		*/
		
		//create subfoldeer in main folder
		File file=new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder");
		
		//to check the Folder present in the given path
		boolean present=file.exists();
		System.out.println("Folder Present  "+present);
		
		//if not create file using mkdir() method.
		if(present==false) {
			file.mkdir();
			
		present=file.exists();
		System.out.println("Folder Present  "+present);
		}
	}
}
