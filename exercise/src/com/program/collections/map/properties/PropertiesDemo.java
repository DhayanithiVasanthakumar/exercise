package com.program.collections.map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[]args) throws IOException {
		//Properties is one of the class in Map.
		Properties p=new Properties();
		
		//FileInputStream ->non java file ah read panum.
		FileInputStream fis=new FileInputStream("C:\\Users\\dhaya\\git\\exercise\\exercise\\src\\com\\program\\collections\\map\\properties\\test.properties");
		p.load(fis);
		System.out.println(p);
			
		String s=p.getProperty("dosa");
		System.out.println(s);
		
		p.setProperty("dosa", "25");
		System.out.println(p);
		
		//set panatha antha file la update pana FileOutputStream use aaguthu.
		FileOutputStream fos=new FileOutputStream("C:\\Users\\dhaya\\git\\exercise\\exercise\\src\\com\\program\\collections\\map\\properties\\test.properties");
		p.store(fos, "updated price");
	}
}
