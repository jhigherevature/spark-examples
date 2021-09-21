package animals;

import java.util.Scanner;

public class Simulator {
	public static void main(String[] args) {		
		PetStore store = new PetStore();
		store.init();
		
		Owner owner = new Owner("Joseph");
		Scanner scan = new Scanner(System.in);
		
		while (owner.getPet() == null) {
			System.out.println("Pick a pet:"
					+ "\nDog"
					+ "\nFish"
					+ "\nBird");
			String selection = scan.nextLine();
			owner.setPet(store.pickPet(selection));
			
			if (owner.getPet() != null)
				break;
			
			System.out.println("Sorry, try again");
		}
		
		owner.printPetInfo();		
	}
}
