package exceptions;

/*
 * To create an Exception (or Error) you can either extend
 * the Exception (or Error class, respectively), or you can
 * extend the Throwable class. Typically speaking you will 
 * extend the Exception (or Error) class because this will
 * provide you with a more stable basis to work off of.
 */
public class EvenNumberException extends Exception {
	/*
	 * The following constructor leverages functionality
	 * already built-into java Exceptions. The Exception
	 * class has a parameterized constructor that takes
	 * a String argument. This String value is used to 
	 * provide a description of the exception that resulted
	 * in your program. Allowing you to provide details
	 * related to the issue in your code.
	 */
	public EvenNumberException(String message) {
		super(message);
	}
}
