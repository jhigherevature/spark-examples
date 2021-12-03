package animals;

/*
 * This is the parent class of our different animal subclasses
 */
public class Animal {
	public String name;
	public int age;
	public double price;
	public String type;
	
	public Animal(String name, int age, String type) {
		// implicit call to superclass constructor
		super();
		this.name = name;
		this.age = age;
		/*
		 * We can use constructors to call any initial functionality
		 * we would like. For example, generating a price based on
		 * the type of animal selected...
		 */
		this.price = getAnimalPrice(type);
		this.type = type;
	}
	
	// This will return a price based on the Animal Type
	public double getAnimalPrice(String type) {
		if (type.equalsIgnoreCase("dog"))
			return 75.00;
		if (type.equalsIgnoreCase("cat"))
			return 60.00;
		if (type.equalsIgnoreCase("fish"))
			return 10.00;
		else
			return 50.00;
	}

	public String toString() {
		return "Animal [name=" + name + 
				", age=" + age + 
				", price=" + price + 
				", type=" + type + "]";
	}
}
