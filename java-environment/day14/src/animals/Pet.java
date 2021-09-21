package animals;

/*
 * Abstract classes may contain abstract or concrete ("normal")
 * methods. Abstract methods can only exists within an abstract class
 * OR interface.
 * 
 * If an abstract class contains an abstract method, the method must
 * be provided a body within a non-abstract subclass
 */
public abstract class Pet {
	public String name;
	protected String type;
	public double price; 
	protected int age;
	
	public abstract void eat();
	
	public Pet (String name, String type, double price, int age) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

