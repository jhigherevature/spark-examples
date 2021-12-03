package animals;

public class Cat extends Animal {
	String breed;
	
	public Cat(String name, int age, String breed) {
		super(name, age, "Cat");
		this.breed = breed;
	}
	
	public void meow () {
		System.out.println("Meow!");
	}
}
