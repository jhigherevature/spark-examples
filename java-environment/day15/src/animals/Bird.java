package animals;

public class Bird extends Pet {

	public void eat() {
		System.out.println("I like seeds!");
	}
	
	public Bird(String name, double price, int age) {
		super(name, "Bird", price, age);
	}
	public void fly() {
		System.out.println("Flappy Bird");
	}
}
