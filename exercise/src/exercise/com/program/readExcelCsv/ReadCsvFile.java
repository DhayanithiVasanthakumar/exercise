package exercise.com.program.readExcelCsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Reads a csv file
 */
public class ReadCsvFile implements ReadFile {

	@Override
	public void readFile(String url) {
		File file = new File(url);
		File[] readcsvFile = file.listFiles();

		for (File f : readcsvFile) {

			if (f.isFile()) {
				String csvfile = f.getName();

				int lastdot = csvfile.lastIndexOf(".");

				String extension = csvfile.substring(lastdot + 1);
				StringBuilder sb = new StringBuilder();
				sb.append("!23" + "123");

				if (extension.equals("csv")) {
					System.out.println("File name is :" + csvfile);

					try (FileReader freader = new FileReader(f);
							BufferedReader breader = new BufferedReader(freader)) {

						String csvreader;

						while ((csvreader = breader.readLine()) != null) {
							System.out.println(csvreader);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					
				}
			}
		}

		

	}
}
