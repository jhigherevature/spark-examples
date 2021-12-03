package exceptions;

public class DuplicateInputException extends Exception {
	/*
	 * Here, we are using the same Constructor as our
	 * EvenNumberException class (a parameterized
	 * constructor of the Exception class which takes
	 * a single String argument); however, here we
	 * pass the same message every time.
	 */
	public DuplicateInputException() {
		super("Duplicate Input Detected");
	}
}
