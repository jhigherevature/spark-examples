package animals;

public class Dog extends Animal {

	String breed;
	
	public Dog(String name, int age, String breed) {
		super(name, age, "Dog");
		this.breed = breed;
	}
	
	public void bark() {
		System.out.println("Woof Woof");
	}
}
