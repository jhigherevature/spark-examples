package b_exceptions;

/** 1. Create sumOddNumbers Method and explain if-statements */
public class B_CustomMathOperations {
	/*
	 * Below, we check the input of both parameters 'a'
	 * and 'b' separately, so that we can get a bit more
	 * insight into the problem. i.e. Was the first input
	 * the cause of the exception or the second?
	 */
	public int sumOddNumbers(int a, int b) throws A_EvenNumberException {
		if (a % 2 == 0) {
			throw new A_EvenNumberException("First input was even");
		}

		if (b % 2 == 0) {
			throw new A_EvenNumberException("Second input was even");
		}

		return a + b;
	}
}
