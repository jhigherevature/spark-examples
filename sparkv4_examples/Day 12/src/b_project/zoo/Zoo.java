package b_project.zoo;

import java.util.ArrayList;
import java.util.List;

import b_project.animals.Animal;
import b_project.animals.Bird;
import b_project.animals.Mammal;
import b_project.animals.Reptile;

/** 1. Change array to list */
public class Zoo {
	
	private List<Exhibit> exhibits; // may refactor to collection

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
		ArrayList<Animal> exhibit1Animals = new ArrayList<Animal> ();
		exhibit1Animals.add(lion);
		exhibit1Animals.add(giraffe);
		exhibit1Animals.add(elephant);
		Exhibit exhibit1 = new Exhibit("Savanna Adventure", "A large habitat with a collection including the largest land mammals!", exhibit1Animals);
		
		ArrayList<Animal> exhibit2Animals = new ArrayList<Animal> ();
		exhibit2Animals.add(anaconda);
		exhibit2Animals.add(cobra);
		exhibit2Animals.add(komodoDragon);
		Exhibit exhibit2 = new Exhibit("Reptile House","See venomous and exotic reptiles from around the world!", exhibit2Animals);
		
		ArrayList<Animal> exhibit3Animals = new ArrayList<Animal> ();
		exhibit3Animals.add(eagle);
		exhibit3Animals.add(vulture);
		exhibit3Animals.add(parrot);
		Exhibit exhibit3 = new Exhibit("Aviary", "View habitats which extend high into the trees overhead, to see the flight of majestic raptors", exhibit3Animals);
		
		// add exhibits to zoo
		exhibits = new ArrayList<Exhibit> ();
		exhibits.add(exhibit1);
		exhibits.add(exhibit2);
		exhibits.add(exhibit3);
	}
	
	
	public List<Exhibit> getExhibits() {
		return exhibits;
	}

	public void setExhibits(List<Exhibit> exhibits) {
		this.exhibits = exhibits;
	}
}
