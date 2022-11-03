package d_scopes;

/*
 * Scopes are isolated levels of access/data in our programs
 * 
 * There are 4 levels of Scopes:
 * Variables at a class and instance scope share the same pool
 * of names/identifiers. This means that you cannot duplicate
 * the same name for a variable on a class
 * 
 * **Class/Static - Variables that are created using the 'static'
 * 					keyword exist in the class/static scope. These
 * 					variables will exist throughout the lifetime
 * 					of the entire application, since the information
 * 					is bound to the class definition, instead of
 * 					any individual objects 
 * **Instance/Object - Variables within instance scope exist
 * 					so long as the object exists in memory
 * 					and we can access the object via its
 * 					reference variable
 * 
 * **Method - Variables within method scope exist within the
 * 				execution of a method, but are lost once we
 * 				finish method execution, or exit the method
 * 				in some way 
 * **Block - Variables within block scope exist within a flow
 * 			control statement. Note that flow control statements
 * 			must exist within a method's scope. Effectively, block
 * 			scopes are a lower scope than method
 * 
 * Method and Block scope variables are also considered 'local
 * scope' Variables. This is because variables created in a method 
 * can duplicate a name used outside of the method. However, you cannot
 * duplicate a variable within the method (including variables created
 * in flow-control statements within that method).
 */
public class Scope {
	/** 1. Create static and instance variables and discuss variable shadowing with 'shadowing' method */
	static String staticWord = "Static Scope"; // static scope
	String instanaceWord = "Instance Scope"; // instance scope
	
	/*
	 * 'variable shadowing' means that variables within a method
	 * which share the same name as an instance or static variable
	 * will be used instead of the instance or static variable.
	 * 
	 * The instance or static variable exists in the 'shadow' of
	 * the method variable.
	 */
	public void shadowing() {
		String instanceWord = "Actually Method Scope";
		System.out.println(instanceWord); // "Actually Method Scope"
	}
	
	/** 2. Create 'giveNumber' method and discuss method scope and using 'return' */
	public double giveNumber() {
		double number = 100.00;
		
		/*
		 * use the 'return' keyword to access data from variables created
		 * in method scope
		 */
		return number;
	}
	
	/** 3. Create 'outOfScope' and explain how method Scope variables only exist in the method they are created */
	public void outOfScope () {
//		System.out.println(number); // error - number does not exist in this method
		double otherNumber = giveNumber(); // invoke the 'giveNumber()' method to access returned expression
	}
	
	/** 4. Create 'block' and explain how block scope works within methods */
	public void block(int input) {
		if (input > 5) {
			String output = "More than 5";
			System.out.println(output);
		}
//		System.out.println(output); // error - output is out of scope
	}
}
