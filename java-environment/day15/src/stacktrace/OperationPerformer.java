package stacktrace;

/*
 * This class is used to showcase stack traces
 */
public class OperationPerformer {
	public static void performAddition(int a, int b) {
		System.out.println("performing Addition:");
		System.out.println("a + b: " + (a+b));
	}
	public static void performSubtraction(int a, int b) {
		System.out.println("performing Subtraction:");
		System.out.println("a - b: " + (a-b));
	}
	public static void performMultiplication(int a, int b) {
		System.out.println("performing Multiplication:");
		System.out.println("a * b: " + (a*b));
	}
	public static void performDivision(int a, int b) {
		System.out.println("performing Division:");
		System.out.println("a / b: " + (a/b));
	}
}
