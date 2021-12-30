package sparktools.utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * This file is responsible for building the following batch files:
 * 		-Zip File Mover : Locate downloaded zip files from Rev Pro and move them to the appropriate folder (dest?)
 * 		-Week Extractor : Extract contents of the zip files and place the week 1 - 4 folders into gradebook folder
 * 		-Lab Completion Writer : Write the names of students into files based on completion of labs (based on Bryn's file). This should write labs to a destination location. Additionally, this should include if-else statements for which weeks to execute...
 * 		-[Low priority] Lab Extractor : Extract contents of the week folders (based on Bryn's file). This should be updated to include if-else statements for which weeks to execute... 
 */
public class BatchFileGenerator {
	private static BufferedWriter bw = null;
	public static void generateBatchFile(String filename, String fileContent) {
		try {
			filename = DataUtility.BATCHFILEPATH + "\\" + filename;
			bw = new BufferedWriter(new FileWriter(filename));
			bw.write(fileContent);
			System.out.println(filename + " generation successful");
		} catch (IOException e) {
			System.out.println("Writing to Batch File Failed");
			e.printStackTrace();
		}
		
		if (bw != null) {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.out.println("Closing BufferedWriter Failed");
				e.printStackTrace();
			}
		}
	}
}
