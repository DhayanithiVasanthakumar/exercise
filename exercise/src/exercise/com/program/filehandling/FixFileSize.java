package exercise.com.program.filehandling;
import java.io.File;

//topic 7
public class FixFileSize {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\dhaya\\OneDrive\\Desktop");
		File[] listfileolder=file.listFiles();
		
		
		for(File f:listfileolder) {
			
			//if(f.isFile()) {
				if(f.isDirectory()) {
				String filenames=f.getName();
//				int lastdot=filenames.lastIndexOf("");
//				String extension=filenames.substring(lastdot+1);
				
				//if(extension.equals("txt")) 
				//fix file length to show on display
				if(f.length()>500)
					System.out.println(filenames+"  "+" size is  "+f.length());
				
				
				//to delete particular file see in topic 3.
			}
		}
	}

}
