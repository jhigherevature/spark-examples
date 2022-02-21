package animals;

/*
 * This is the parent class of our different animal subclasses
 */
public class Animal {
	public String name;
	public int age;
	public String type;
	
	public Animal(String name, int age, String type) {
		// implicit call to superclass constructor
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public String toString() {
		return "Animal [name=" + name + 
				", age=" + age + 
				", type=" + type + "]";
	}
}
