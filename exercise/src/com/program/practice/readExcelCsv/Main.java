package com.program.practice.readExcelCsv;

public class Main {
	public static void main(String[]args) {
		
		FactoryMethod factoryMethod=new FactoryMethod();
		ReadFile read=factoryMethod.files("ReadCsvFile");
		try {
			read.readFile("C:\\Users\\dhaya\\OneDrive\\Desktop\\FileHandle\\subfolder\\");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
