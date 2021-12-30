package sparktools.controllers;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import sparktools.services.ExcelOutputService;
import sparktools.utility.DataUtility;
import sparktools.utility.WorkBookFinder;
import sparktools.utility.WorkBookReader;

public class WorkbookController {
	public static void run() {
		System.out.println("Locating Workbook...");
		Workbook workbook = WorkBookFinder.FindExistingWorkbook(DataUtility.WORKBOOKOUTPUTPATH, DataUtility.WORKBOOKFILENAME);
		Sheet sheet = workbook.getSheetAt(0);
		
		System.out.println("Writing student names to workbook...");
		String[] labs = WorkBookReader.getLabNames();
		for (int i = 0; i < labs.length; i++) {
			String[] students = null;
			try {
				students = WorkBookReader.readFileData(DataUtility.LABFILEPATH + "\\" + labs[i]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (students != null) {
				ExcelOutputService.printExcelColumn(workbook, sheet, labs[i], students,i);
			}
		}
		
		try {
			workbook.close();
		} catch (IOException e) {
			System.out.println("Closing Workbook Failed...");
			e.printStackTrace();
		}
		
		System.out.println("Workbook Generation Complete");
	}
}
