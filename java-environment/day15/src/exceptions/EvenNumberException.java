package exceptions;

/*
 * To create an Exception (or Error) you can either extend
 * the Exception (or Error class, respectively), or you can
 * extend the Throwable class. Typically speaking you will 
 * extend the Exception (or Error) class because this will
 * provide you with a more stable basis to work off of.
 */
public class EvenNumberException extends Exception {
	public EvenNumberException(String message) {
		super(message);
	}
}
