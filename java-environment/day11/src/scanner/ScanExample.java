package scanner;

import java.util.Scanner;

public class ScanExample {
	public static void main(String[] args) {
		System.out.println("::: START OF APPLICATION :::");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.println("Your input was: " + input);

		int menuSelection = scan.nextInt();
		System.out.println("Your menuSelection was: " + menuSelection);
		
		System.out.println("::: END OF APPLICATION :::");
		// do not close your scanner until you are completely done with it!
		scan.close();
	}
}
