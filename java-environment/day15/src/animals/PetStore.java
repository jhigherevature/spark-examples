package animals;

public class PetStore {
	public Pet[] pets;
	public void init() {
		
		Pet one = new Dog("Doug", 75.00, 2, "Blue Heeler", "Black and Grey");
		Pet two = new Fish("Fred", 12.50, 1, true);
		Pet three = new Bird("Bill", 50.00, 3);
		
		pets = new Pet[] {one, two, three};
	}
	
	public Pet pickPet(int choice) {
		Pet ret = pets[choice];
		if (ret == null)
			System.out.println("Please choose another pet");
		
		return ret;
	}
	
	public Pet pickPet(String choice) {
		choice = choice.toUpperCase().intern();
		if (choice == "DOG") {
			return pickPet(0);
		} else if (choice == "FISH") {
			return pickPet(1);
		} else if (choice == "BIRD") {
			return pickPet(2);
		} else {
			return null;
		}
	}
}
