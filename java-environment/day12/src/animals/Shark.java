package animals;

/*
 * The extends keyword is used to establish a hierarchy
 * between classes. The subclass (child class) extends
 * a parent (super) class
 */
public class Shark extends Animal {
	/*
	 * By default, Java will give you a no-argument
	 * constructor. This constructor will attempt to invoke
	 * a no-argument constructor of your parent class...
	 * This is known as constructor chaining...This process
	 * will continue until the Object class constructor has
	 * been called!
	 * 
	 * The moment you provide a custom constructor, java does
	 * not supply you with a no-argument construtor. However,
	 * constructor chaining must still occur and resolve back
	 * to the object class!
	 */
	public Shark(String name, int age) {
		super(name, age, "Shark");
	}
}
