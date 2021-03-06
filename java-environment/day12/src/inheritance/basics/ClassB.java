package inheritance.basics;

/*
 * To establish an inheritance heirarchy in your
 * code, use the keyword 'extends'
 */
public class ClassB extends ClassA {
	/*
	 * In Java, we can override the functionality
	 * inherited from a parent class if you match the 
	 * method signature of the inherited method
	 */
	// Overriding the inherited method:
	public void printInfo() {
		System.out.println("Class B method : This was overridden from Class A");
	}
	
	/*
	 * Overloading a method: Multiple methods of
	 * the same name may exist within the same class
	 * so long as we can distinguish between them
	 * based on the parameter list.
	 */
	public void printInfo(String info) {
		System.out.println("Your info is: " + info);
	}
}
