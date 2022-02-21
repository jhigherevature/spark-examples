package shortcircuit;

/*
 * A "regular expression" is a pattern used to describe a character
 * within a String. In Java regular expressions begin with a backslash.
 * 		The '\t' expression is used to add a tabulation to a String.
 * 		The '\n' expression is used to put words on a new line
 * 
 * Short circuit operators have a chance to skip the evaluation of
 * the second operand, if the first operand can determine the entire
 * evaluation on its own.
 * 
 * For AND (&&) operations if the first operand is false
 * the second operand will not be evaluated
 * 
 * For OR (||) operations if the first operand is true
 * the second operand will not be evaluated
 */
public class ShortCircuitOperator {
	public static void main(String[] args) {
		System.out.println("Normal AND Operator [&]:");
		System.out.println(
				"\tfalse & true: " + 
						(printAndReturnFalse() & printAndReturnTrue()));
		
		System.out.println("Shortcircuit AND Operator [&&]:");
		System.out.println(
				"\tfalse && true: " + 
						(printAndReturnFalse() && printAndReturnTrue()));
		
		System.out.println("Shortcircuit AND Operator [&&]:");
		System.out.println(
				"\ttrue && false: " + 
						(printAndReturnTrue() && printAndReturnFalse()));
		
		System.out.println("Normal OR Operator [|]:");
		System.out.println(
				"\ttrue | false: " + 
						(printAndReturnTrue() | printAndReturnFalse()));
		
		System.out.println("Shortcircuit OR Operator [||]:");
		System.out.println(
				"\ttrue || false: " + 
						(printAndReturnTrue() || printAndReturnFalse()));
	}
	
	public static boolean printAndReturnTrue() {
		System.out.println("\tTRUE!!");
		return true;
	}
	
	public static boolean printAndReturnFalse() {
		System.out.println("\tFALSE!!");
		return false;
	}
}
