package animals;

import java.util.Scanner;

public class AnimalPicker {
	public static void main(String[] args) {
		Owner own = new Owner();
		own.name = "Joseph";
		
		Scanner scan = new Scanner(System.in);
		int menuSelection = 0;
		
		while (menuSelection != 3) {
			System.out.println("Choose an Animal:"
					+ "\n[1] - Dog"
					+ "\n[2] - Shark"
					+ "\n[3] - Quit");
			
			menuSelection = scan.nextInt();
			
			switch(menuSelection) {
			case 1:
				own.pet = new Dog("Doug", 7);
				break;
			case 2:
				own.pet = new Shark("Sam", 18);
				break;
			case 3:
				System.out.println("Good Bye");
				break;
			}
			
			System.out.println("Current Pet: " + own.pet.name);
		}
		
		System.out.println("Owner: " + own.name);
		System.out.println("Pet: " + own.pet.name);
	}
}
