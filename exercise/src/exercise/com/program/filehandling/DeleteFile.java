package exercise.com.program.filehandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file =new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\test.txt");
		//to delete file
		file.delete();
		
		//to check the file is delete or not
		boolean present=file.exists();
		System.out.println("File present "+present);
		
		
	}

}
