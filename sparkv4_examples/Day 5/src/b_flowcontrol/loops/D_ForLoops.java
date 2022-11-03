package b_flowcontrol.loops;

/*
 * For-Loops are a very common looping structure used with collections
 * of data. For loops use three statements, each seperated by a semi-colon
 * to determine the logic of the loop itself.
 * 
 *  The syntax of a for-loop is:
 *  
 *  	for (initialization; condition; modification) {
 *  		// code-to-execute-when-condition-is-true
 *      }
 *      
 * initialization : A statement which executes a single time prior to the 
 * 		execution of the for-loop.
 * 
 * condition : a boolean statement which determines whether the for-loop
 * 		should execute. The for-loop will continue to repeat until the
 * 		condition statement is false.
 * 
 * modification : a statement which executes once after each iteration cycle
 * 		of the loop. This statement should be used to make sure the loop
 * 		will not repeat forever.
 */
public class D_ForLoops {
	public static void main(String[] args) {
		System.out.println("::: For Loops :::");
		/** 1. explain common for-loop structure and 3 for-loop statements. */
		// 'i' is a common name for the initialized for-loop variable
		for (int i = 0; i < 5; i++) {
			System.out.println("The value of i is: " + i);
		}
		
		/** 2. Discuss how to 'reverse' a for-loop */
		// Notice how we can change any of the statements
		for (int j = 10; j > 0; j -= 2) {
			System.out.println("J : " + j);
		}
		
		/** 3. explain that each statement of a for-loop is flexible, though this is not common */
		// For loops are flexible!
		for (int k = 3; k == 3; k = 100) {
			System.out.println("This will only run once!");
		}
	}
}
