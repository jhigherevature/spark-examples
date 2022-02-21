package animals;

/*
 * Using the 'extends' keyword establishes an IS-A
 * relationship.
 * 
 * "A Cat IS-A(n) Animal"
 */
public class Cat extends Animal {
	public String breed;
	
	public Cat(String name, int age, String breed) {
		super(name, age, "Cat");
		this.breed = breed;
	}
	
	public void meow () {
		System.out.println("Meow!");
	}
}
