package petstore.animals;

import animals.interfaces.Carnivore;

public class Cat extends Animal implements Carnivore {
	String breed;
	
	public Cat(String name, int age, String breed) {
		super(name, age, "Cat");
		this.breed = breed;
	}
	
	public void meow () {
		System.out.println("Meow!");
	}

	// Overridden from the Carnivore interface
	@Override
	public void eatMeat() {
		System.out.println("Cats only eat meat!");
	}
	@Override
	public void digest() {
		System.out.println("Digesting the food...");
	}
}
