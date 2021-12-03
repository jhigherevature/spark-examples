package constructors;

public class IdGenerator {
	private static int currentId = 1000;
	public static int generateId() {
		System.out.println("Generating new Id");
		return currentId++;
	}
}
