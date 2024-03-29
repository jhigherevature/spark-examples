package exceptions;

public class FinallySimulator {
	/*
	 * The keyword 'finally' can be applied to the end
	 * of a try-catch block to perform an operation
	 * regardless of whether an exception is thrown or
	 * not. 
	 * 
	 * The only way a 'finally' block will not execute
	 * is when we use the System.exit() method or in
	 * the event of a critical system failure (i.e. a
	 * power outage or some other hardware issue...)
	 * 
	 */
	public static void main(String[] args) {
		try {
			infiniteRecursion(0);
		} catch (StackOverflowError e) {
			System.out.println("STACK OVERFLOW!");
			/*
			 * exit() is a static method on the System
			 * class which allows the developer to halt
			 * the execution of a program. The integer
			 * argument indicates a 'status code' for
			 * the halting operation. A '0' indicates a
			 * 'normal exit', while any other non-zero
			 * number represents an 'abnormal' exit.
			 */
			System.exit(0);
			e.printStackTrace();
		} finally {
			System.out.println("Notice that the Finally block will "
					+ "still execute, even if we 'run out of memory' "
					+ "due to a stack overflow");
		}
	}
	
	public static void infiniteRecursion(int a) {
		System.out.println(a);
		infiniteRecursion(++a);
	}
}
