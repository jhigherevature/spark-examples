package d_methods;

public class B_Main {
	public static void main(String[] args) {
		/** 1. Create calculator Object and invoke 'printWelcomeMessage' */
		A_Calculator calc = new A_Calculator();
		calc.printWelcomeMessage();
		
		/** 2. Create double primitive to store returned value from add method. */
		double result = calc.add(25,  5); // the 'add()' method returns 30, the sum of the arguments '25' and '5'
		System.out.println("calc.add(25, 5) gives us: " + result); // 30
		
		/** 3. Explain variable as arguments and method invoked in other methods. */
		double a = 25;
		double b = 5;
		double difference = calc.subtract(a, b);
		System.out.println("calc.subtract(25, 5) gives us: " + difference); // 20
		
		/** 4. Explain order that methods resolve when invoking methods as arguments of other methods. */
		System.out.println("calc.multiply(25, 5) gives us: " + calc.multiply(a, b)); // 125
		System.out.println("calc.divide(25, 5) gives us: " + calc.divide(a, b)); // 5
	}
}
