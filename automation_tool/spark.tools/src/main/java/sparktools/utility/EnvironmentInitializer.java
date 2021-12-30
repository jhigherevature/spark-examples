package sparktools.utility;

import java.io.File;

/**
 * 
 * @author JosephHighe
 *
 */

/*
 * This class should really be consolidated to a "folderGenerator" method
 * that takes a String as the directory name instead...
 */
public class EnvironmentInitializer {
	public void init() {
		generateFolders();
		generateBatchFiles();
	}
	
	private void generateFolders() {
		System.out.println("generating assignment_list folder...");
		generateAssignmentListFolder();
		
		System.out.println("generating batch_files folder...");
		generateBatchFilesFolder();
		
		System.out.println("generating gradebook_sheet folder...");
		generateGradebookFolder();
		
		System.out.println("generating lab_weeks folder...");
		generateLabWeeksFolder();
		
		System.out.println("generating zip_files folder...");
		generateZipFilesFolder();
	}
	
	private void generateBatchFiles() {
		System.out.println("generating file-write.bat file...");
		BatchFileGenerator.generateBatchFile(DataUtility.BATCHFILENAME_WRITER, BatchFileContent.getBatchFileContent_FileWrite());
		
		System.out.println("generating lab-week-extrator.bat file...");
		BatchFileGenerator.generateBatchFile(DataUtility.BATCHFILENAME_WEEK_EXTRACTOR, BatchFileContent.getBatchFileContent_WeekExtract());
		
		System.out.println("generating clear-zip-files.bat file...");
		BatchFileGenerator.generateBatchFile(DataUtility.BATCHFILENAME_CLEAR_ZIP,BatchFileContent.getBatchFileContent_ClearZip());
		
		System.out.println("generating clear-lab-weeks.bat file...");
		BatchFileGenerator.generateBatchFile(DataUtility.BATCHFILENAME_CLEAR_LAB, BatchFileContent.getBatchFileContent_ClearLab());
		
		// Generate lab-content-extractor.bat file
	}
	
	private boolean generateAssignmentListFolder() {
		boolean ret = false;
		String directoryName = DataUtility.LABFILEPATH;
		File directory = new File(directoryName);
		if (! (ret = directory.exists())) {
			ret = directory.mkdir();
			System.out.println("assignment_list folder generation successful");
			/*
			 * Possibly change to mkdirs() to create the entire directory path, including parents...
			 */
		} else if (ret) {
			System.out.println("assignment_list folder already exists");
		}
		
		return ret;
	}
	
	private boolean generateBatchFilesFolder() {
		boolean ret = false;
		String directoryName = DataUtility.BATCHFILEPATH;
		File directory = new File(directoryName);
		if (! (ret = directory.exists())) {
			ret = directory.mkdir();
			System.out.println("batch_files folder generation successful");
			/*
			 * Possibly change to mkdirs() to create the entire directory path, including parents...
			 */
		} else if (ret) {
			System.out.println("batch_files folder already exists");
		}
		
		return ret;
	}
	
	private boolean generateGradebookFolder() {
		boolean ret = false;
		String directoryName = DataUtility.WORKBOOKOUTPUTPATH;
		File directory = new File(directoryName);
		if (! (ret = directory.exists())) {
			ret = directory.mkdir();
			System.out.println("gradebook_sheet folder generation successful");
			/*
			 * Possibly change to mkdirs() to create the entire directory path, including parents...
			 */
		} else if (ret) {
			System.out.println("gradebook_sheet folder already exists");
		}
		
		return ret;
	}
	
	private boolean generateLabWeeksFolder() {
		boolean ret = false;
		String directoryName = DataUtility.LABDATAFILEPATH;
		File directory = new File(directoryName);
		if (! (ret = directory.exists())) {
			ret = directory.mkdir();
			System.out.println("lab_weeks folder generation successful");
			/*
			 * Possibly change to mkdirs() to create the entire directory path, including parents...
			 */
		} else if (ret) {
			System.out.println("lab_weeks folder already exists");
		}
		
		return ret;
	}
	
	private boolean generateZipFilesFolder() {
		boolean ret = false;
		String directoryName = DataUtility.ZIPFILEPATH;
		File directory = new File(directoryName);
		if (! (ret = directory.exists())) {
			ret = directory.mkdir();
			System.out.println("zip_files folder generation successful");
			/*
			 * Possibly change to mkdirs() to create the entire directory path, including parents...
			 */
		} else if (ret) {
			System.out.println("zip_files folder already exists");
		}
		
		return ret;
	}
}
