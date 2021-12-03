package petstore.inventory;

import petstore.animals.*;

public class Toy extends Item {
	public Toy(double price, String name, String description) {
		super(price, name, description);
	}
	
	public void play(Animal anim) {
		if (anim instanceof Dog) {
			System.out.println(anim.name + " is playing with the " + this.name);
		} else if (anim instanceof Cat) {
			System.out.println(anim.name + " doesn't seem too interested.");
		} else if (anim instanceof Fish) {
			System.out.println(anim.name + " doesn't know how to play with the " + this.name);
		} else {
			System.out.println("Some other generic message here...");
		}
	}
}
