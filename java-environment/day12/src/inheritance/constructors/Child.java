package inheritance.constructors;

/*
 * Java will provide every class you define with a
 * no-argument constructor, implicitly, UNLESS you
 * yourself create a custom constructor.
 * 
 * The no-argument constructor java provides to
 * you implicitly is known as the default constructor!
 */
public class Child extends Parent {
	// No-argument (no-args) constructor for the Child class
	public Child() {
		/*
		 * The implicit functionality of Constructors in
		 * Java will call the no-args constructor of your
		 * parent class...If this no-args constructor does
		 * not exist, then you will need to account for this
		 * as the developer!
		 */
		//super(); // implicit call
		System.out.println("No-args Constructor [Child Class]");
	}
	
	public Child(String first_name, String last_name) {
		/*
		 * The implicit functionality of Constructors in
		 * Java will call the no-args constructor of your
		 * parent class...If this no-args constructor does
		 * not exist, then you will need to account for this
		 * as the developer!
		 */
		super(first_name, last_name);
		System.out.println("Parameterized Constructor [Child Class]");
	}
}
