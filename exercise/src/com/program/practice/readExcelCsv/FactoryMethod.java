package com.program.practice.readExcelCsv;

public class FactoryMethod {
	public ReadFile files(String filetype) {

		switch (filetype) {
		case "ReadCsvFile":
			return new ReadCsvFile();

		case "ReadExcelFile":
			return new ReadExcelFile();

		default:
			return null;
			
		}

	}
}
