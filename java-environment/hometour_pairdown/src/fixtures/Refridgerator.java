package fixtures;

/*
 * An Example of a class which implements the Interactable Interface
 * allowing this object, when created, to be interacted with
 * 
 * Note, we could also make more generic classes, such as an "appliance"
 * class, or a "book" class, instead of a specific type of appliance/book/object
 */
public class Refridgerator extends Fixture implements Interactable {
	
	// Parameterized Constructor
	public Refridgerator(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public void interact() {
		// TODO: Implement Method
	}
}
