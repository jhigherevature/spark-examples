package sparktools.services;

import java.io.File;

import sparktools.utility.DataUtility;

/*
 * This class should determine if the path specified contains the necessary folders appropriately nested...
 * if not, it should request that user run the initialization process (ask them to confirm), then respond 
 * by performing the environment initialization.
 */
public class EnvironmentValidationService {
	public boolean validateEnvironment() {
		System.out.println("Validating Environment setup...");
		boolean valid = true;
		String print = "";
		String directoryName = DataUtility.LABFILEPATH;
		File directory = new File(directoryName);
		if (! directory.exists()) {
			print = print.concat("Environment Missing Folder: " + directoryName +"\n");
			valid = false;
			// stop and ask for initialization...
		}
		
		directoryName = DataUtility.BATCHFILEPATH;
		directory = new File(directoryName);
		if (! directory.exists()) {
			print = print.concat("Environment Missing Folder: " + directoryName +"\n");
			valid = false;
			// stop and ask for initialization...
		}
		
		directoryName = DataUtility.LABDATAFILEPATH;
		directory = new File(directoryName);
		if (! directory.exists()) {
			print = print.concat("Environment Missing Folder: " + directoryName +"\n");
			valid = false;
			// stop and ask for initialization...
		}
		
		directoryName = DataUtility.WORKBOOKOUTPUTPATH;
		directory = new File(directoryName);
		if (! directory.exists()) {
			print = print.concat("Environment Missing Folder: " + directoryName +"\n");
			valid = false;
			// stop and ask for initialization...
		}
		
		directoryName = DataUtility.ZIPFILEPATH;
		directory = new File(directoryName);
		if (! directory.exists()) {
			print = print.concat("Environment Missing Folder: " + directoryName +"\n");
			valid = false;
			// stop and ask for initialization...
		}
		
		String file_name = DataUtility.BATCHFILEPATH + "\\" + DataUtility.BATCHFILENAME_WRITER;
		File batch_file = new File(file_name);
		if (! batch_file.exists()) {
			print = print.concat("Environment Missing BatchFile: " + file_name +"\n");
			valid = false;
			// stop and ask for initialization...
		}
		
		file_name = DataUtility.BATCHFILEPATH + "\\" + DataUtility.BATCHFILENAME_WEEK_EXTRACTOR;
		batch_file = new File(file_name);
		if (! batch_file.exists()) {
			print = print.concat("Environment Missing BatchFile: " + file_name +"\n");
			valid = false;
			// stop and ask for initialization...
		}
		
		file_name = DataUtility.BATCHFILEPATH + "\\" + DataUtility.BATCHFILENAME_CLEAR_ZIP;
		batch_file = new File(file_name);
		if (! batch_file.exists()) {
			print = print.concat("Environment Missing BatchFile: " + file_name +"\n");
			valid = false;
			// stop and ask for initialization...
		}
		
		file_name = DataUtility.BATCHFILEPATH + "\\" + DataUtility.BATCHFILENAME_CLEAR_LAB;
		batch_file = new File(file_name);
		if (! batch_file.exists()) {
			print = print.concat("Environment Missing BatchFile: " + file_name +"\n");
			valid = false;
			// stop and ask for initialization...
		}
		
		if (valid) {
			System.out.println("Environment setup validated and ready for use");
			return valid;
		} else {
			System.out.print(print);
			return valid;
		}
	}
}
