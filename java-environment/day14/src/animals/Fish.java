package animals;

public class Fish extends Pet {
	public boolean freshWater;
	
	public void eat() {
		System.out.println("Fish Flakes are my favorite");
	}
	
	public Fish(String name, double price, int age, boolean freshWater) {
		super(name, "Fish", price, age);
		this.freshWater = freshWater;
	}
	public void swim() {
		System.out.println("Just keep swimming");
	}
}
