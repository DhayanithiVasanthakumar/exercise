package exercise.com.program.readExcelCsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExcelFile implements ReadFile {

	@Override
	public void readFile(String url) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			File file=new File(url);
			File[] readexcelFile=file.listFiles();
			System.out.println(readexcelFile);
			for(File f:readexcelFile) {
				if(f.isFile()) {
					String excelfile=f.getName();
					
					int lastdot=excelfile.lastIndexOf(".");

					String extension=excelfile.substring(lastdot+1);
					
					if(extension.equals("xlsx")) {
						System.out.println(excelfile);
					}
				}
			}
			FileReader freader=new FileReader(file);
			BufferedReader breader=new BufferedReader(freader);
			
			String excelreader=breader.readLine();
			
			
			while(excelreader != null) {
				excelreader=breader.readLine();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			throw new Exception("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
	

