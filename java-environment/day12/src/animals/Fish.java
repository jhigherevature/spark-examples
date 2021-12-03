package animals;

public class Fish extends Animal {
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
}
