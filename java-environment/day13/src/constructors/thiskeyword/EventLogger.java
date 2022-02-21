package constructors.thiskeyword;

/*
 * This class is used as part of the 'this' keyword example.
 * 
 * This is used to simulate the idea of logging actions
 * which can occur when objects are created
 */
public class EventLogger {
	public static void logObjectCreation(Object obj) {
		System.out.println("Logging Event: " + obj + " Created.");
	}
}
