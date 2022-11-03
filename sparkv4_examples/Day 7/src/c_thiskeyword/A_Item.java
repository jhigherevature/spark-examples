package c_thiskeyword;

/*
 * The keyword 'this' is used to reference the current
 * instance of an object (like looking into a mirror
 * and seeing yourself).
 * 
 * The 'this' keyword is used to distinguish between 
 * method parameters and the associated field on a class.
 * Note, it is a convention to use the same name for
 * a parameter and the name of a field on a class, but
 * not a requirement.
 * 
 * When conventions are followed automation of tasks 
 * or the creation of tools becomes easier by relying on
 * common structures or familiar design. This can make 
 * development easier and faster.
 */
public class A_Item {
	/** 1. Create class and briefly explain getters and setters */
	static int count;
	String name;
	double price;
	
	// 'getters' and 'setters' are a common convention in OOP. More on this later...
	void setPrice(double price) {
		// 'this.price' references the variable on the class/object
		// price without 'this' references the parameter
		this.price = price;
	}
	double getPrice() {
		return this.price; // note 'this' is not required here
	}
	
	void setName (String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	/** 2. Create Constructor and explain initialization of values */
	// 'this' is commonly used to initialize values in constructors
	public A_Item(String name, double price) {
		count++;
		this.name = name;
		this.price = price;
	}
}
