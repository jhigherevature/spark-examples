package stacktrace;

/*
 * This class is used to showcase stack traces
 */
public class Calculator {
	public static void add(int a, int b) {
		System.out.println("add Method on Calculator invoked");
		OperationPerformer.performAddition(a, b);
	}
	public static void subtract(int a, int b) {
		System.out.println("subtract Method on Calculator invoked");
		OperationPerformer.performSubtraction(a, b);
	}
	public static void multiply(int a, int b) {
		System.out.println("multiply Method on Calculator invoked");
		OperationPerformer.performMultiplication(a, b);
	}
	public static void divide(int a, int b) {
		System.out.println("divide Method on Calculator invoked");
		OperationPerformer.performDivision(a, b);
	}
}
