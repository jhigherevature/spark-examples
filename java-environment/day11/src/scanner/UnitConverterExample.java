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
			 * 		-Ask user for the amount to convert
			 * 		-Store input into a variable
			 * 		-Perform conversion
			 * 		-Tell the user the answer
			 * 
			 * repeat...
			 */
			switch(menuSelection) {
			case 1:
				// Miles to KM conversion
				System.out.println("Enter Number of Miles");
				userInputForCalculation = scan.nextDouble();
				// print calculation
				
				/*
				 * Alternatively using the separate methods 
				 * created below:
				 * userInput = getInput();
				 * MilesToKM(userInput);
				 */
				break;
			case 2:
				// Cups to Tsp conversion
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
			 * 		if (menuSelection == 1) {
			 * 			// Miles to KM conversion
			 * 			calculation = getInput();
			 * 		}else if (menuSelection == 2) {
			 * 			// Cups to Tsp conversion
			 * 		}else if (menuSelection == 3) {
			 * 			// Gallons to Liters conversion
			 * 		} else if (menuSelection == 4) {
			 * 			// System.out.println("Ending loop");
			 * 		} else {
			 * 			// System.out.println("Input not recognized");
			 * 		} // end of if-else
			 */
		} // end of while-loop
	} // end of main method
	
	/*
	 * Typically applications break up logic for reusability and 
	 * maintainability. It is best to begin getting practice using
	 * separate methods and invoking them instead of writing the 
	 * exact statements directly in your main method...
	 * 
	 * Here is an example of a separate method to gather user input
	 */
	public static double getInput() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
		
		/*
		 * We typically separate logic into individual methods
		 * to make code more maintainable/flexible
		 * 
		 * for example, checking the type of data received from
		 * the scanner, or providing a default value, like below
		 * 		Double value = Double.valueOf(scan.next());
		 * 		if (value != null) {
		 * 			return value;
		 * 		}else {
		 * 			System.out.println("The value you input was not recognized!");
		 * 			return 0.0;
		 * 		}
		 */

	}
	
	/* 
	 * A Separate method to perform a Unit Conversion
	 */
	public static double MilesToKM(double value) {
		// calculate value and return the answer
		double calculation = value;
		return calculation;
	}
}
