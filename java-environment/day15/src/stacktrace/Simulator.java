package stacktrace;

/*
 * A Stack Trace acts as a 'bread-crumb' trail of
 * operations in a program's execution. As you invoke
 * methods within other methods, a "trace" or record
 * of those invocations is recorded by the JVM. When
 * an exception or error is thrown, the stack trace
 * is commonly printed to the console, giving you 
 * insight as to the actions which ultimately led
 * to the exception or error.
 * 
 * When reading a stack trace, the bottom of the 
 * list are the first methods called, and the top
 * of the list are the most recent methods called
 */
public class Simulator {
	public static void main(String[] args) {
		Calculator.divide(1, 1);
	}
}
