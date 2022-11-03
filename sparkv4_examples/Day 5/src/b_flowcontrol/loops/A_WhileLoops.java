package b_flowcontrol.loops;

/*
 * While Loops are a basic flow-control statement which allows 
 * repetition of code so long as a boolean condition remains 
 * true. The syntax of a while loop is as follows:
 * 
 * 		while (condition) {
 * 			// code-to-repeat-while-condition-is-true
 *  	}
 *  
 * When code enters a loop, no other code will execute until the 
 * loop exits (when the condition is false).
 */
public class A_WhileLoops {
	public static void main(String[] args) {
		/** 1. Explain loops in general, and while-loop */
		System.out.println(" ::: Start of Application [While loop] :::"); // This denotes the start of our program
		
		int count = 0;
		while (count < 5) {
			System.out.println("The value of Count is: " + count); // notice that the value of 'count' changes
			count++; // without this line, our loop would repeat forever!
		}
		
		System.out.println(" ::: End of Application :::"); // this doesn't print until loop has finished
	}
}
