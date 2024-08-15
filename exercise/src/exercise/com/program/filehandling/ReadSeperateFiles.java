package exercise.com.program.filehandling;

import java.io.File;
//topic 6
public class ReadSeperateFiles {
	public static void main(String[]args) {
		File file=new File("C:\\Users\\dhaya\\OneDrive\\Desktop");
		//to display all files and folders in specific location
		File[] readFileFolderNames=file.listFiles();
		
		
		for(File f:readFileFolderNames) {
			//to get only files so use if
			if(f.isFile()) {
				//to get all files name so use getName()
				String onlyFiles=f.getName();
				//to find last dot(.) in that name use lastIndexOf() 
				int lastDot=onlyFiles.lastIndexOf(".");
				//substring used to display given condition(lastDot) and add +1
				//dot appram irukara allam file um display panum
				String extension=onlyFiles.substring(lastDot+1);
				
				//txt file ilama vera venum na string la pass pananum
				if(extension.equals("txt")) {
					System.out.println(onlyFiles);
				}
				
			}
			
		}
		
	}

}
