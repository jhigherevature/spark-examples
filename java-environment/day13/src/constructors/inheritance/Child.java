package constructors.inheritance;

/*
 * The first thing EVERY constructor MUST do is call 
 * another constructor...Typically, this is the parent 
 * class' constructor. This "constructor chaining" 
 * occurs so that we can guarantee that the Object class 
 * is called upon for each object created. Every class 
 * implicitly inherits from the Object class, unless 
 * you specifically inherit from another class.
 * 
 * Constructor Chaining - invoking a "chain" of constructors, 
 * one after the other.
 * 
 * Recall, the default constructor Java will provide 
 * takes no-arguments. As a result, the implicit functionality 
 * of Constructors in Java is to call the no-args constructor 
 * for a parent class.
 */
public class Child extends Parent {
	public Child() {
		// implicit behavior
// 		super(); // error - Parent does not contain a no-args constructor
		super("First", "Last");
	}

	public Child(String firstName, String lastName) {
		super(firstName, lastName);
	}
}
