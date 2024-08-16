package exercise.com.program.filehandling;

import java.io.File;
//topic 3
public class DeleteFile {

	public static void main(String[] args) {

		/*
		File file =new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\test.txt");
		//to delete file
		file.delete();
		
		//to check the file is delete or not
		boolean present=file.exists();
		System.out.println("File present "+present);
		*/
		
		//to delete particular file see in topic 7
		
		File file=new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder");
		File[] onlyfilefolder=file.listFiles();
		
		for(File f:onlyfilefolder) {
			if(f.isFile()) {
				String filename=f.getName();
				int lastdot=filename.lastIndexOf(".");
				String extension=filename.substring(lastdot+1);
				
				if(extension.equals("txt")) {
					System.out.println(f.delete()+"Deleted sucessfully");
					
				}
			}
		}
		
	}

}
