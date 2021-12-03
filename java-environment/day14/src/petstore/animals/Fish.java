package petstore.animals;

import animals.interfaces.Carnivore;
import animals.interfaces.Herbivore;

public class Fish extends Animal implements Carnivore, Herbivore {
	String species;
	boolean freshWater;
	public Fish(String name, int age, String species, boolean freshWater) {
		super(name, age, "Fish");
		this.species = species;
		this.freshWater = freshWater;
	}
	
	public void swim() {
		System.out.println("I actually don't know how to swim!");
	}

	@Override
	public void eatPlants() {
		System.out.println("I'm not too picky!");
	}

	@Override
	public void eatFruit() {
		System.out.println("I'm not too picky!");		
	}

	@Override
	public void eatMeat() {
		System.out.println("I'm not too picky!");
	}

	/*
	 * Notice that, because both the Carnivore and Herbivore
	 * interfaces both have a method called 'digest' with 
	 * the same method signature, we can provide one overridden
	 * method to satisfy both!
	 */
	@Override
	public void digest() {
		System.out.println("Digesting all the food!");
	}
}
