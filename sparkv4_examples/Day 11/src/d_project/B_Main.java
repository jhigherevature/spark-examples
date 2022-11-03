package d_project;

import java.util.Scanner;

import d_project.zoo.Exhibit;
import d_project.zoo.Zoo;

public class B_Main {
	
	// create a scanner object. We can make it static for any static methods we create.
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// print welcome message to user
		System.out.println(
				"*************************\n" + 
				"***        ZOO        ***\n" + 
				"*************************\n");
		
		// create a zoo for animals
		Zoo zoo = new Zoo();
		zoo.init();
		
		// create some way to loop until user leaves zoo/quits
		boolean run = true;
		while(run) {
			// give user choices of what to exhibits are available and get user's choice
			/** 1. abstract away implementation into another method */
			int choice = chooseExhibit(zoo);
			
			Exhibit chosenExhibit;
			try {
			chosenExhibit = zoo.getExhibits()[choice - 1];
			} catch (ArrayIndexOutOfBoundsException ex) {
				break;
			}
			
			// give user choices for what animal to see and get user's animal choice
			/** 2. abstract away implementation into another method  */
			choice = chooseAnimal(chosenExhibit);
			
			switch(choice) {
			case 1: 
				System.out.println("First animal chosen.");
				System.out.println(chosenExhibit.getExhibitAnimals()[choice - 1]);
				break;
			case 2:
				System.out.println("second animal chosen.");
				System.out.println(chosenExhibit.getExhibitAnimals()[choice - 1]);
				break;
			case 3: 
				System.out.println("third animal chosen.");
				System.out.println(chosenExhibit.getExhibitAnimals()[choice - 1]);
				break;
			case 4: System.out.println("Going back to exhibits...");
				break;
			default: System.out.println("Error: incorrect input.");
				break;
			}
			
			
		}
		
		// print goodbye message
		System.out.println("Thanks for visiting!");
		scan.close();
	}
	
	public static int chooseExhibit(Zoo zoo) {
		System.out.println("\nSelect an Exhibit:");
		for (int i = 0; i < zoo.getExhibits().length; i++) {
			System.out.println((i + 1) + ") " + zoo.getExhibits()[i].getName());
		}
		System.out.println("4) Leave zoo");
		
		// get user's exhibit choice
		return scan.nextInt();
	}
	
	public static int chooseAnimal(Exhibit chosenExhibit) {
		System.out.println("\nSelect an animal to view:");
		for (int i = 0; i < chosenExhibit.getExhibitAnimals().length; i++) {
			System.out.println((i + 1) + ") " + chosenExhibit.getExhibitAnimals()[i].getName());
		}
		System.out.println("4) Main menu");
		
		// get user's animal choice
		return scan.nextInt();
	}
}
