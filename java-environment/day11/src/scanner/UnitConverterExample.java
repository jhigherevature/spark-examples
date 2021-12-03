package scanner;

import java.util.Scanner;

public class UnitConverterExample {
	public static void main(String[] args) {
		
		System.out.println("Conversions:"
				+ "\n[1] - Miles to KM"
				+ "\n[2] - Cups to Tsp"
				+ "\n[3] - Gallons to Liters");
		int menuSelection = 0;
		Scanner scan = new Scanner(System.in);
		while (menuSelection != 4) {
			menuSelection = scan.nextInt();
			double userInputForCalculation;
			
			/*
			 * Each menu option should follow the same basic
			 * steps...
			 * Ask user for the amount to convert
			 * 	store input into a variable
			 * perform conversion
			 * tell the user the answer
			 * 
			 * repeat...
			 */
			switch(menuSelection) {
			case 1:
				
				MilesToKM( getInput() );
				
				
				// userInputForCalculation = scan.nextDouble();
				// userInputForCalculation * 1.3...
				// Miles to KM conversion
				break;
			case 2:
				// Cups to Tsp conversion
				// userInputForCalculation / 8 
				break;
			case 3:
				// Gallons to Liters conversion
				break;
			case 4:
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("Input not recognized");
			} // end of Switch
			
			/*
			 * Alternatively using an if-else statement block:
			 */
//			if (menuSelection == 1) {
//				// Miles to KM conversion
//				calculation = getInput();
//			}else if (menuSelection == 2) {
//				// Cups to Tsp conversion
//			}else if (menuSelection == 3) {
//				// Gallons to Liters conversion
//			} else if (menuSelection == 4) {
//				// System.out.println("Ending loop");
//			} else {
//				// System.out.println("Input not recognized");
//			} // end of if-else
		} // end of while-loop
	} // end of main method
	
	// Separate input gathering...
	public static double getInput() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
		
		/*
		 * We typically separate logic into individual methods
		 * to make code more maintainable/flexible
		 * 
		 * for example, checking the type of data received from
		 * the scanner, or providing a default value, like below
		 */
//		Double value = Double.valueOf(scan.next());
//		if (value != null)
//			return value;
//		else {
//			System.out.println("The value you input was not recognized!");
//			return 0.0;
//		}
	}
	
	// Separate Unit Conversions...
	public static double MilesToKM(double value) {
		// calculate value and return the answer
		return 0;
	}
}
