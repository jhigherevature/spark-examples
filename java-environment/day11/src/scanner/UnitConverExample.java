package scanner;

import java.util.Scanner;

public class UnitConverExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Conversions:"
				+ "\n[1] - Miles to KM"
				+ "\n[2] - Cups to Tsp"
				+ "\n[3] - Gallons to Liters");
		int menuSelection = 0;
		
		while (menuSelection != 4) {
			if (menuSelection == 1) {
				// Miles to KM conversion
			}else if (menuSelection == 2) {
				// Cups to Tsp conversion
			}else if (menuSelection == 3) {
				// Gallons to Liters conversion
			}
		}
	}
	
	// Separate input gathering...
	public static double getInput() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}
	
	// Separate Unit Conversions...
	public static void MilesToKM(double value) {
		// calculate...
	}
}
