package petstore.inventory;

// This class is used to generate a new ID for inventory items
public class IdGenerator {
	private static int currentId = 1000;
	public static int generateId() {
		return currentId++;
	}
}
