package exercise.com.program.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		//create file in folder 
		File file=new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\test.txt");
		boolean present=file.exists();
		
		if(present ==false){
			try {
				//createNewFile() method used to create a file
				boolean created=file.createNewFile();
				System.out.println("File created  "+created);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}		
		}
		

	}

}
