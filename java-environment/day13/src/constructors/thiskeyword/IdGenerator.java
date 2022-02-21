package constructors.thiskeyword;

/*
 * This class is used as part of the 'this' keyword example.
 * 
 * This is used to simulate the idea of using a class to generate
 * a unique id for objects as they are created in your program.
 */
public class IdGenerator {
	private static int currentId = 1000;
	public static int generateId() {
		System.out.println("Generating new Id");
		return currentId++;
	}
}
