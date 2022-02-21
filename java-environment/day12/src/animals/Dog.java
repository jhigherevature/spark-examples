package animals;

/*
 * Using the 'extends' keyword establishes an IS-A
 * relationship.
 * 
 * "A Dog IS-A(n) Animal"
 */
public class Dog extends Animal {

	public String breed;
	
	public Dog(String name, int age, String breed) {
		super(name, age, "Dog");
		this.breed = breed;
	}
	
	public void bark() {
		System.out.println("Woof Woof");
	}
}
