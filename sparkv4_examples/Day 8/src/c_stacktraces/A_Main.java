package c_stacktraces;

public class A_Main {
	public static void main(String[] args) {
		/** 1. Create MathInvoker Objects, run code and explain reading stack trace. 
		 * 		Show case how clicking on line in stack trace will navigate to file
		 */
		MathInvoker math = new MathInvoker();
		math.invokeMath(1, 0);
	}
}
