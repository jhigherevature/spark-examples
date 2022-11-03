package d_project;

import java.util.Scanner;

public class Main {
	
	// create a scanner object. We can make it static for any static methods we create.
	private static Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		// print welcome message to user
		System.out.println(
				"*************************\n" + 
				"***        ZOO        ***\n" + 
				"*************************\n");
		
		// create a zoo for animals
		
		// create some way to loop until user leaves zoo/quits
		boolean run = true;
		while(run) {
			// give user choices of what to exhibits are available to see or if they want to leave
			// hard-code a menu, for now
			System.out.println("\nSelect an Exhibit:");
			System.out.println("1) Exhibit 1");
			System.out.println("2) Exhibit 2");
			System.out.println("3) Exhibit 3");
			System.out.println("4) Leave zoo");
			
			// get user's exhibit choice
			int choice = scan.nextInt();
			if (choice == 4) {
				break;
			}
			
			// give user choices for what animal to interact with
			// hard-code a menu, for now
			System.out.println("\nSelect an animal to view:");
			System.out.println("1) Animal 1");
			System.out.println("2) Animal 2");
			System.out.println("3) Animal 3");
			System.out.println("4) Go back to exhibits");
			
			// get user's animal choice
			choice = scan.nextInt();
		
			// perform action based off of user's animal choice
			switch(choice) {
			case 1: 
				System.out.println("First animal chosen.");
				break;
			case 2:
				System.out.println("second animal chosen.");
				break;
			case 3: 
				System.out.println("third animal chosen.");
				break;
			case 4: System.out.println("Going back to exhibits...");
				break;
			default: System.out.println("Error: incorrect input.");
				break;
			}
		// end loop
		}
		
		// print goodbye message
		System.out.println("Thanks for visiting!");
		scan.close();
	}
}
