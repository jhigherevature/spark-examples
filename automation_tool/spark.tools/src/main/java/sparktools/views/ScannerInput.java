package sparktools.views;

import java.util.Scanner;

public class ScannerInput {
	/*
	 * Methods: Get Batch File Path [void] => update DataUtility.LabFolder & Output
	 * folder => [input] + "/assignment_list" && [input] + "/gradebook_sheet" Set
	 * Output File [void] => change output file name DataUtility.OUTPUTFILENAME =
	 * [input]
	 * 
	 * Print Menu [void] ==> Probably in a different view... Confirm Choice [return
	 * bool]
	 * 
	 * Process Input Commands: Help
	 * 
	 * 
	 */
	private static Scanner SCAN;
	
	public static Scanner getScannerInput() {
		if (SCAN == null)
			SCAN = new Scanner(System.in);

		return SCAN;
	}
	
	public static int getScannerNextInt() {
		try {
			Integer ret = Integer.valueOf(SCAN.next());
			return ret;
		} catch (NumberFormatException e) {
			System.out.println("Enter a valid whole number");
			if (SCAN.hasNext())
				SCAN.nextLine();
		}
		
		return -1;
	}

	// confirm input does not contain special characters etc...
	public boolean checkValidInput() {
		return false;
	}

	public boolean confirm(String message) {
		boolean isValid = false;
		while (!isValid) {
			System.out.println(message +"\n[y] or [yes] \n[n] or [no]");
			String check = SCAN.next();
			if (check.equalsIgnoreCase("y") || check.equalsIgnoreCase("yes")) {
				return true;
			} else if (check.equalsIgnoreCase("n") || check.equalsIgnoreCase("no")) {
				return false;
			} else {
				System.out.println("try again");
			}
		}
		return false;
	}
}
