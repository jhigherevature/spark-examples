package d_methods;

public class A_Calculator {
	/** 1. Explain method basics and 'void' */
	public void printWelcomeMessage() {
		System.out.println("Hello and thank you for using my cool calculator!");
	}
	
	/** 2. Create add method. Explain 'return' and parameters. */
	public double add(int x, int y) {
		double sum = x + y;
		return sum;
	}
	
	/** 3. Create subtract, multiply and divide methods. */
	public double subtract(double x, double y) {
		return x - y;
	}
	
	public double multiply (double x, double y) {
		return x * y;
	}
	
	public double divide(double x, double y) {
		return x / y;
	}
}
