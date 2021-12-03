package petstore.animals;

import animals.interfaces.Herbivore;

public class Rabbit extends Animal implements Herbivore {

	public Rabbit(String name, int age) {
		super(name, age, "Rabbit");
	}

	@Override
	public void eatPlants() {
		System.out.println("No meat for me thank you!");
	}

	@Override
	public void eatFruit() {
		System.out.println("No meat for me thank you!");
	}

	@Override
	public void digest() {
		System.out.println("Digesting Plants and Fruits!");
	}
}
