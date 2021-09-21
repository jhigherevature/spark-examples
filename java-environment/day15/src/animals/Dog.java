package animals;

public class Dog extends Pet implements Swimmer, Carnivore, Herbivore {
	public String breed;
	public String color;
	
	public void eat() {
		System.out.println("I like table scraps");
	}
	
	public Dog(String name, double price, int age, String breed, String color) {
		super(name, "Dog", price, age);
		this.breed = breed;
		this.color = color;
	}
	public void bark() {
		System.out.println("Woof Woof");
	}
	public void swim() {
		System.out.println("I like to splash in the water");
	}

	@Override
	public void floating() {
		System.out.println("Floating Lazily");
	}
}
