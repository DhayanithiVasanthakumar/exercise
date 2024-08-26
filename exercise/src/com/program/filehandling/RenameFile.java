package com.program.filehandling;

import java.io.File;
//topic 4
public class RenameFile {
	public static void main(String[]args) {
		
		//already irukara filename
		File file =new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\test.txt");
		
		if(file.exists()) {
		
		//antha file la irunthu intha file name chanege pananu  by using  renameTo() .
		File newName=new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\changed file name.txt");
		boolean renameSucess=file.renameTo(newName);
		System.out.println("File Renamed"+renameSucess);
		
		}
		else {
			System.out.println("File name is same");
		}
		
		//Read file name
		File newName=new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\changed file name.txt");
		System.out.println("File name is :"+ newName.getName());
		
	}

}
