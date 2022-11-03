package b_exceptions;

public class C_Main {
	/*
	 * When a declared method has a 'throws' declaration,
	 * it is used to consolidate how many try/catch blocks
	 * are needed throughout your code. In this case, any
	 * method which has the 'throws' declaration must 
	 * eventually be handled within a try/catch block, as 
	 * shown below
	 */
	public static void main(String[] args) {
		/** 1. Create CustomMathOperations Objects, invoke sumOddNumbers and explain try-catch */
		B_CustomMathOperations math = new B_CustomMathOperations();
		try {
			math.sumOddNumbers(2, 1);
		} catch (A_EvenNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
