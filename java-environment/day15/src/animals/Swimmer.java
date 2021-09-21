package animals;

/*
 * By default, and interface, and the methods defined within
 * are abstract.
 * 
 * if you want to create a concrete method (a method with a body)
 * you can use the keyword default within the interface method
 * declaration
 */
public interface Swimmer {
	public void swim();
	public default void floating() {
		System.out.println("Floating in the water!");
	}
}
