package animals;

public class Dog extends Animal {
	public String breed;
	
	/*
	 * Constructor for Dog class
	 * 	Constructors will share the exact name of a class
	 * 	You must use the 'new' keyword when calling a constructor
	 */	
	public Dog(String name, int age) {
		super(name, age, "Dog");
	}
	
	/*
	 * Standard methods declare a return type. 
	 * Constructors will NOT have a return type
	 * 
	 */
	public void bark() {
		System.out.println("Woof Woof");
	}
	
	public void wagTail() {
		
	}
	
	public boolean isHungry() {
		return true;
	}
}
