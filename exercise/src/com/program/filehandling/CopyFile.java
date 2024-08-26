package com.program.filehandling;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//topic 10
public class CopyFile {
	public static void main(String[] args) {
		try {
			
			//it for any files ex: .mp3 etc...
			//input=read
			//InputStream is abstract class so it defines in child class(FileInputStream). 
			InputStream input=new FileInputStream("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\1.jpg");
			//output=write
			//OutputStream is abstract class so it defines in child class(FileOutputStream). 
			OutputStream output=new FileOutputStream("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\temple.jpg");
			
			int content=input.read();
			while(content !=-1) {
				output.write(content);
				content=input.read();
			}
			output.flush();
			System.out.println("image copied sucessfully");
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

}
