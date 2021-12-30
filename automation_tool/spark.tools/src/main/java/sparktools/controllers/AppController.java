package sparktools.controllers;

import sparktools.services.BatchFileExecutorService;
import sparktools.services.EnvironmentValidationService;
import sparktools.utility.DataUtility;
import sparktools.utility.EnvironmentInitializer;
import sparktools.views.MenuViews;
import sparktools.views.ScannerInput;

public class AppController {
	public static void run() {
		System.out.println("Initializing Services...");
		EnvironmentValidationService evServ = new EnvironmentValidationService();
		BatchFileExecutorService bfeServ = new BatchFileExecutorService();
		
		System.out.println("Initializing Utilities...");
		MenuViews menus = new MenuViews();
		ScannerInput.getScannerInput();
		
		if (!evServ.validateEnvironment()) {
			System.out.println("Initializing Environment...");
			EnvironmentInitializer envInit = new EnvironmentInitializer();
			envInit.init();
		}
		
		boolean running = true;
		int choice = -1;
		application: while (running) {
			menus.printAppChoices();
			choice = ScannerInput.getScannerNextInt();
			switch (choice) {
			case 1:
				bfeServ.executeBatchFile(DataUtility.BATCHFILENAME_WEEK_EXTRACTOR);
				bfeServ.executeBatchFile(DataUtility.BATCHFILENAME_WRITER);
				WorkbookController.run();
				break;
			case 2:
				System.out.println("Not fully implemented, please check back later...");
				break;
			case 3:
				bfeServ.executeBatchFile(DataUtility.BATCHFILENAME_WEEK_EXTRACTOR);
				break;
			case 4:
				bfeServ.executeBatchFile(DataUtility.BATCHFILENAME_WRITER);
				break;
			case 5:
				WorkbookController.run();
				break;
			case 6:
				bfeServ.executeBatchFile(DataUtility.BATCHFILENAME_CLEAR_ZIP);
				break;
			case 7:
				bfeServ.executeBatchFile(DataUtility.BATCHFILENAME_CLEAR_LAB);
				break;
			case 0:
				System.out.println("Exiting...");
				break application;
			default:
				System.out.println("Please select a valid option");
				break;
			}
		}
	}
}
