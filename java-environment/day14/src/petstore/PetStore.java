package petstore;

import java.util.Scanner;

import petstore.animals.Animal;
import petstore.interfaces.Purchaseable;
import petstore.inventory.Food;
import petstore.inventory.InventoryManager;
import petstore.inventory.Item;
import petstore.inventory.Toy;

public class PetStore {

	public static Scanner scan = new Scanner(System.in);
	public static InventoryManager iMgr = new InventoryManager();

	public static void main(String[] args) {
		iMgr.init();
		Customer customer = new Customer("Joseph", 300.0);

		boolean running = true;
		String menuSelection = null;
		Purchaseable p = null;
		while (running) {
			printMainMenu();
			menuSelection = scan.next().toLowerCase();
			switch (menuSelection) {
			case "a":
			case "animal":
				/*
				 * Since interfaces can technically be implemented 
				 * by any class, we can cast any class to the 
				 * interface type.
				 */
				p = (Purchaseable) pickAnimal();
				break;
			case "f":
			case "food":
				p = (Purchaseable) pickFood();
				break;
			case "t":
			case "toy":
				p = (Purchaseable) pickToy();
				break;
			case "q":
			case "quit":
				running = false;
				break;
			default:
				System.out.println("Sorry, I didn't quite understand that.");
				p = null;
				break; // technically not needed since default is the last case of our switch statement
			}

			if (!running) {
				System.out.println("GoodBye!");
				return;
			}

			if (p != null) {
				// purchase selected Animal and/or other item...
				System.out.println("Purchase Selection?" 
						+ "\n['y' 'yes'| - yes]" 
						+ "\n['n' 'no'| - no]");
				menuSelection = scan.next().toLowerCase();
				if (menuSelection.equals("y") || menuSelection.equals("yes")) {
					double change = purchase(p, customer.getMoney());
					customer.setMoney(change);
				}
			}
			System.out.println("You have: " + customer.getMoney() + " left.");
		}
	}

	public static Item pickFood() {
		int menuSelection;
		Food ret = null;

		printFoodMenu();
		menuSelection = scan.nextInt();
		ret = (Food) iMgr.pickFood(menuSelection);

		if (ret != null) {
			System.out.println("You chose: " + ret.getName());
			System.out.println("This costs: $" + ret.getPrice());
		}

		return ret;
	}

	public static Item pickToy() {
		int menuSelection;
		Toy ret = null;

		printToyMenu();
		menuSelection = scan.nextInt();
		ret = (Toy) iMgr.pickToy(menuSelection);

		if (ret != null) {
			System.out.println("You chose: " + ret.getName());
			System.out.println("This costs: $" + ret.getPrice());
		}

		return ret;
	}

	public static double purchase(Purchaseable p, double amount) {
		return p.purchase(amount);
	}

	public static Animal pickAnimal() {
		int menuSelection;
		Animal ret = null;

		printAnimalMenu();
		menuSelection = scan.nextInt();
		ret = iMgr.pickAnimal(menuSelection);

		if (ret != null) {
			System.out.println("You chose a: " + ret.type);
			System.out.println("This pet costs: $" + ret.price);
		}

		return ret;
	}

	public static void printAnimalMenu() {
		System.out.println("Choose your pet!:");
		Animal[] animals = iMgr.getAnimals();
		for (int i = 0; i < animals.length; i++) {
			System.out.println(i + " - " + animals[i].type);
		}
	}

	public static void printMainMenu() {
		System.out.println("What would you like to do?"
				+ "\n['A' | 'Animal'] - View Animals"
				+ "\n['F' | 'Food'] - View Food" 
				+ "\n['T' | 'Toy'] - View Toys" 
				+ "\n['Q' | 'Quit'] - Quit");
	}

	public static void printFoodMenu() {
		System.out.println("Choose the Food:");
		Item[] allFood = iMgr.getFood();
		for (int i = 0; i < allFood.length; i++) {
			System.out.println(i + " - " + ((Food) allFood[i]).getFoodType());
		}
	}

	public static void printToyMenu() {
		System.out.println("Choose a Toy:");
		Item[] toys = iMgr.getToys();
		for (int i = 0; i < toys.length; i++) {
			System.out.println(i + " - " + toys[i].getName());
		}
	}
}
