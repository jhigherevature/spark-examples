package animals;

/*
 * Using the 'extends' keyword establishes an IS-A
 * relationship.
 * 
 * "A Rabbit IS-A(n) Animal"
 */
public class Rabbit extends Animal {
	public Rabbit(String name, int age) {
		super(name, age, "Rabbit");
	}
}
