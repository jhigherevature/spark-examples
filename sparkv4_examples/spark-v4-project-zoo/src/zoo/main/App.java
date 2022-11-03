package zoo.main;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import zoo.animals.*;
import zoo.exhibits.*;

public class App {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(
				"*************************\n" + 
				"***        ZOO        ***\n" + 
				"*************************\n");
		Zoo zoo = new Zoo();
		zoo.init();
		boolean run = true;
		while (run) {
			printExhibits(zoo);
			int choice = -1;
			try {
				choice = scan.nextInt();
				if (choice == zoo.getExhibits().size() + 1) {
					run = false;
					break;
				}

				Exhibit exhibit = zoo.getExhibits().get(choice - 1);
				System.out.println("Traveling to: " + exhibit.getName());
				System.out.println(exhibit.getDescription());
				while (exhibit != null) {
					exhibit = pickAnimal(exhibit);
				}

			} catch (InputMismatchException e) {
				System.out.println("Numerical Input Only!");
				scan.nextLine();
				continue;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Please enter a valid menu option");
				scan.nextLine();
				continue;
			}
		}

		System.out.println("Thanks for visiting!");
		scan.close();
	}

	public static Exhibit pickAnimal(Exhibit exhibit) {
		List<Animal> animals = exhibit.getExhibitAnimals();
		System.out.println("Pick an animal:");
		int n = animals.size();
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " - " + animals.get(i - 1).getName());
		}
		System.out.println(n + 1 + " - Back");

		int animalChoice = -1;
		try {
			animalChoice = scan.nextInt();
			if (animalChoice == n + 1) {
				System.out.println("Leaving " + exhibit.getName());
				return null;
			}
			System.out.println(animals.get(animalChoice - 1));
		} catch (InputMismatchException e) {
			System.out.println("Numerical Input Only!");
			scan.nextLine();
		}

		return exhibit;
	}

	public static void printExhibits(Zoo zoo) {
		System.out.println("Select an Exhibit:");
		List<Exhibit> exhibits = zoo.getExhibits();
		for (int i = 1; i <= exhibits.size(); i++)
			System.out.println(i + " - " + exhibits.get(i - 1).getName());

		System.out.println(exhibits.size() + 1 + " - Quit");
	}
}
