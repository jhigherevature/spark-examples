package animals.interfaces;

public interface Swimmer {
	// methods declared in interfaces are implicitly abstract
	public void swim();
	
	/*
	 * the 'default' keyword can be used on interface methods
	 * to provide a body to the method.
	 */
	public default void floating() {
		System.out.println("Floating in the water");
	}
}
