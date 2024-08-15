package exercise.com.program.filehandling;

import java.io.File;

public class ReadFileFolderNames {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\dhaya\\OneDrive\\Desktop");
		
		//for read files =list()
		//String[] namesOfFilesFolder=file.list();
		//using for loop
		/*
		for(int i=0;i<namesOfFilesFolder.length;i++) {
			System.out.println(namesOfFilesFolder[i]);
		}
		*/
		
		//for each
		/*
		for(String s:namesOfFilesFolder) {
			System.out.println(s);
		}
		*/
		
		
		
		//for read all files and folders with directory  =listFiles()
		/*
		File[] nameOfFileFolder=file.listFiles();
		for(File f:nameOfFileFolder) {
			System.out.println(f);
		}
		*/
		
		//read only files   =isFile() 
		/*
		File[] nameOfFileFolder=file.listFiles();
		for(File f:nameOfFileFolder)
		if(f.isFile()) {
			System.out.println(f );
		}
		*/
		
		//read only folders =isDirectory()
		File[] nameOfFileFolder=file.listFiles();
		for(File f:nameOfFileFolder)
		if(f.isDirectory()) {
			System.out.println(f );
		}
		
	}

}
