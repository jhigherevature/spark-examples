package animals;

public class Animal {
	public String name;
	public int age;
	public String biome;
	public String type;
	
	public Animal (String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	/*
	 * This is an example of method overriding.
	 * We override the inherited behavior from our
	 * parent class, with our own implementation
	 */
	public String toString() {
		return "Name: " + name + ", age: " + age + ", biome: " + biome + ", type: " + type;
	}
	
	public boolean equals(Animal other) {
		if (this.name.equals(other.name))
			return true;
		else
			return false;
	}
}
