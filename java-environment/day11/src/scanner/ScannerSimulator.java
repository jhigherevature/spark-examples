package scanner;

/*
 * The Scanner class exists within the java.util package
 * of the JRE
 */
import java.util.Scanner;

public class ScannerSimulator {
	
	public static Scanner app_Scanner = new Scanner(System.in);
	/*
	 * The Scanner class allows you to read data from
	 * a location specified (in our case, System.in) 
	 * and return data to be stored in a variable. This
	 * is effectively our replaced for the prompt() function
	 * in Javascript
	 */
	public static void main(String[] args) {
		System.out.println("::: START OF APPLICATION :::");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me an int:");
		int in = scan.nextInt();
		System.out.println("You gave me: " + in);		
		
		System.out.println("::: END OF APPLICATION :::");
		
		/*
		 * Some classes are resource intensive, and as such
		 * java wants you to 'close' these resources. Closing
		 * a resource means that you will stop using it entirely.
		 * Note, if you close a resource, it CANNOT BE REOPENED!
		 * do not close your scanner until you are completely 
		 * done with it!
		 */
		scan.close();		
//		Scanner scan_2 = new Scanner(System.in);
//		double dbl = scan_2.nextDouble();
	}
}
