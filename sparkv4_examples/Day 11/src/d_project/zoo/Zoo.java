package d_project.zoo;

import java.util.ArrayList;

import d_project.animals.Animal;
import d_project.animals.Bird;
import d_project.animals.Mammal;
import d_project.animals.Reptile;

public class Zoo {
	
	private Exhibit[] exhibits; // may refactor to collection
	
	/** 1.  initialize zoo through either constructor or method: 
	 *  - create animals
	 *  - create exhibits
	 *  - update zoo's exhibits property
	 * 
	 * */
	public void init() {
		// create animals
		Mammal lion = new Mammal("Lion", "Lions are the only cats that live in groups.");
		Mammal giraffe = new Mammal("Giraffe", "Giraffes can stand half an hour after being born and can run after 10 hours!");
		Mammal elephant = new Mammal("Elephant", "Elephants need up to 150kg of food per day, meaning they can spend up to three-quarters of their day eating.");
		
		Reptile anaconda = new Reptile("Anaconda", "Despite being reptiles, Anacondas do not lay eggs; they give birth to live young!");
		Reptile cobra = new Reptile("King Cobra", "A King Cobra's distinctive hood is actually a system of rub bones and muscles that can flex and move!");
		Reptile komodoDragon = new Reptile("Komodo Dragon", "Komodo Dragons are the largest lizards on earth, growing up to ten feet long.");

		Bird eagle = new Bird("Bald Eagle", "Bald Eagles have a wing span over 6ft!");
		Bird vulture = new Bird("Vulture", "The immune and digestive systems of Vultures allow them to eat rotten meat without getting sick.");
		Bird parrot = new Bird("Parrot", "Parrots mostly taste using taste buds found on the roof of their beaks.");

		// create exhibits
		Animal[] exhibit1Animals = {lion, giraffe, elephant};
		Exhibit exhibit1 = new Exhibit("Savanna Adventure", "A large habitat with a collection including the largest land mammals!", exhibit1Animals);
		
		
		Animal[] exhibit2Animals = {anaconda, cobra, komodoDragon};
		Exhibit exhibit2 = new Exhibit("Reptile House","See venomous and exotic reptiles from around the world!", exhibit2Animals);
		
		
		Animal[] exhibit3Animals = {eagle, vulture, parrot};
		Exhibit exhibit3 = new Exhibit("Aviary", "View habitats which extend high into the trees overhead, to see the flight of majestic raptors", exhibit3Animals);
		
		// add exhibits to zoo
		exhibits = new Exhibit[3];
		exhibits[0] = exhibit1;
		exhibits[1] = exhibit2;
		exhibits[2] = exhibit3;
	}
	
	
	public Exhibit[] getExhibits() {
		return exhibits;
	}

	public void setExhibits(Exhibit[] exhibits) {
		this.exhibits = exhibits;
	}
}
