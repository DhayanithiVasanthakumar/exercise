package com.program.readExcelCsv;

public class FactoryMethod {
	public ReadFile files(String filetype) {

		switch (filetype) {
		case "ReadCsvFile":
			return new ReadCsvFile();

		case "ReadExcelFile":
			return new ReadExcelFile();

		default:
			//Test
			return null;
			
		}

	}
}
