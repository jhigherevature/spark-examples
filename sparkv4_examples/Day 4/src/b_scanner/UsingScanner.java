package b_scanner;

/** 1. explain importing and import Scanner*/
import java.util.Scanner;

public class UsingScanner {
	public static void main(String[] args) {
		/** 2. create Scanner object: */
		Scanner scan = new Scanner(System.in);
		
		/** 3. using the Scanner object: */
			// nextInt() - consumes next integer in current line but NOT newline character
			System.out.println("Give me an int:");
			int in = scan.nextInt();
			System.out.println("You gave me: " + in);	
			
			// nextDouble() - consumes next double in current line but NOT newline character
			System.out.println("Give me a double:");
			double in2 = scan.nextDouble();
			System.out.println("You gave me: " + in2);	
			
			// next() - consumes next string token in current line but NOT newline character
			System.out.println("Give me a word:");
			String in3 = scan.next();
			System.out.println("You gave me: " + in3);	
			
			// nextLine()
			System.out.println("Give me a phrase:");
			scan.nextLine(); // consume newline character before asking for a whole line if other scanner methods previously used!
			String in4 = scan.nextLine();
			System.out.println("You gave me: " + in4);	
			
		
			/** 4. closing Scanner object: */
			scan.close();
		
		System.out.println("::: END OF APPLICATION :::");
		
	}
}
