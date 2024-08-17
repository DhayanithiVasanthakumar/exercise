package exercise.com.program.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//topic 8
public class ReadWriteFile {
	public static void main(String[] args) {
		
		File file =new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\test.txt");
		
		try {
			//create file in given location
			file.createNewFile();
			//write a file
			FileWriter writer=new FileWriter(file);
			//it return type is int so result gives in hashcode value to char.
			writer.write(97);
			//it return type is string so result is normal text
			writer.write("hello dhaya");
			//when ever write a code flush is compulsary .writer ta irukara alla data um kudutha location file ku push panum.
			writer.flush();
			writer.close();
			
			//read a file
			FileReader reader=new FileReader(file);
			
			/*
			 * type 1 to read a file
			//return type is int
			int output=reader.read();
			//yepa la file kula data iruko apa lam ula poogum
			while(output!= -1) {
				//use type casting to convert int to char
				System.out.print((char)output);
				//print panathu adutha char ah print oanum
				output=reader.read();

			}
			*/
			
			//type 2 to read a file
			//length() is long but array size is int.so use type casting
			char[] ch=new char[(int)file.length()];
			//to count char in file
			System.out.println(ch.length);
			//.......................................
			//count panathu la read pana read() use pananum
			reader.read(ch);
			//it is array so use for each to print all char in file
			for(char ch1:ch) {
				System.out.print(ch1);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
