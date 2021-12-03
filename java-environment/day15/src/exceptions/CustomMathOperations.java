package exceptions;

/*
 * This class is used to show case different methods
 * which can throw our custom made 'EvenNumberException'
 * and 'DuplicateInputException' objects.
 * 
 * When a method can result in an exception, we use
 * the keyword 'throw' to create that exception. If
 * a method uses the keyword 'throw' within the body
 * of the method to create an exception, we can either
 * surround that code in a try-catch block, or, more
 * commonly, we can also use the keyword 'throws' to
 * declare that the exception may be the result of
 * the method's operations. When using the 'throws'
 * declaration, we call this 'ducking' an exception.
 */
public class CustomMathOperations {
	/*
	 * Used to check the 'EvenNumberException'
	 * 
	 * Below, we check the input of both parameters 'a'
	 * and 'b' separately, so that we can get a bit more
	 * insight into the problem. i.e. Was the first input
	 * the cause of the exception or the second?
	 */
	public int sumOddNumbers(int a, int b) throws EvenNumberException {
		if (a % 2 == 0) {
			throw new EvenNumberException("First input was even");
		}

		if (b % 2 == 0) {
			throw new EvenNumberException("Second input was even");
		}

		return a + b;
	}
	
	/*
	 * The following method show cases how we can use
	 * the custom-made 'DuplicateInputException' class.
	 * Notice that we do not need to pass any String for
	 * a message, because of how we created the no-args
	 * constructor within the 'DuplicateInputException'
	 * class.
	 */
	public int sumDifferentNumbers(int a, int b) 
			throws DuplicateInputException {
		if (a == b)
			throw new DuplicateInputException();
		
		return a+b;
	}

	/*
	 * The throws declaration of Methods can include a
	 * list of all potential exceptions thrown within
	 * a method, separated by a comma.
	 */
	public int sumDifferentOddNumbers(int a, int b) 
			throws EvenNumberException, DuplicateInputException {
		if (a % 2 == 0 || b % 2 == 0) {
			throw new EvenNumberException("Even Input detected");
		}
		
		if (a == b) {
			throw new DuplicateInputException();
		}
		return a+b;
	}
}
