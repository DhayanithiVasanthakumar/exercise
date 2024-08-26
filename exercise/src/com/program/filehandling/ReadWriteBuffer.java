package com.program.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//topic 9
public class ReadWriteBuffer {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\test.txt");
		
		try {
			//bufferWriter use pana whenever run program it erase all data and create new file.
			//so ithu fix pana append pananum ithu pana data change aagathu.
			//FileWriter fwriter=new FileWriter(file,true);
			
			FileWriter fwriter=new FileWriter(file);
			BufferedWriter bwriter=new BufferedWriter(fwriter);
			//it advantage is create new line
			bwriter.write("hello from b writer.");
			bwriter.newLine();
			bwriter.write("java");
			bwriter.newLine();
			bwriter.write("spring boot.");
			bwriter.newLine();
			bwriter.write("bootstrap");
			bwriter.flush();
			bwriter.close();
			
			
			FileReader freader=new FileReader(file);
			
			//BufferReader read line by line
			BufferedReader breader=new BufferedReader(freader);
			
			//.readLine() return type is String
			String line=breader.readLine();
			
			//to count line
			int countLine=0;
			//to sentence count
			int sentencecount=0;
			//to count words
			int wordCount=0;
			//char count
			int charCount=0;
			
			//filereader  la char read panu so !=-1 kuduthom 
			//BufferedReaderla line ah read panum so !=null kuduthom 
			while(line!=null) {
				//to find sentence count:  .split() is one of the String class it used to split the given condition in below code condition is "[.]" fullstop
				String[] sentence=line.split("[.]");
				sentencecount=sentencecount+sentence.length;
				
				//find word count
				String[] word=line.split(" ");
				wordCount=wordCount+word.length;
				
				System.out.println(line);
				
				//find char count
				charCount=charCount+line.length();
				
				//to count line in file
				countLine++;
				//System.out.println(line+"line count is:"+countLine);
				

				
				//line print panathu next line la irukaratha  next line ah print panum
				line=breader.readLine();
			}
			//to print total no of lines
			System.out.println("Total no of lines in file is :"+countLine);
			//in sentencecount have bug
			System.out.println("Total sentence in file is :"+sentencecount);
			//to word count
			System.out.println("Total words in file is :"+wordCount);
			//to char count
			System.out.println("Total character in file is :"+charCount);

			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
