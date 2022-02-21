package animals;

import java.util.Scanner;

public class PetStore {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		PetOwner owner = new PetOwner();
		owner.name = "Joseph";

		boolean running = true;
		String menuSelection = null;
		
		while (running) {
			printAnimalMenu();
			menuSelection = scan.next().toLowerCase();
			/*
			 * Remember that fall-through logic means
			 * that we will perform code in ALL of the blocks
			 * beneath a matching case, until the keyword
			 * 'break' or the end of our switch statement
			 * has been reached...
			 */
			switch (menuSelection) {
			case "c":
			case "cat":
				owner.setPet(new Cat("Ceaser", 2, "Calico"));
				break;
			case "d":
			case "dog":
				owner.setPet(new Dog("Doug", 3, "Golden Retriever"));
				break;
			case "f":
			case "fish":
				owner.setPet(new Fish("Franklin", 1, "Goldfish", true));
				break;
			case "r":
			case "rabbit":
				owner.setPet(new Rabbit("Roger", 2));
				break;
			case "q":
			case "quit":
				System.out.println("Goodbye!");
				running = false;
				break;
			default:
				owner.pet = null;
				System.out.println("Sorry, I didn't understand that, please try again");
			}

			if (owner.pet != null && running) {
				System.out.println("You chose a: " + owner.pet.type);
			}
		}
	}

	public static void printAnimalMenu() {
		System.out.println("Choose your pet!:"
				+ "\n[C | 'Cat'] - Cat"
				+ "\n[D | 'Dog'] - Dog"
				+ "\n[F | 'Fish'] - Fish"
				+ "\n[R | 'Rabbit'] - Rabbit"
				+ "\n[Q | 'Quit'] - Quit"
				);
	}
}
