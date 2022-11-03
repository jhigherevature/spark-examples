package b_flowcontrol.loops;

/*
 * Do-While Loops are another flow-control statement which allows 
 * looping of code. The difference between a while loop and do-while
 * loop is that a do-while loop will always execute at least once.
 * 
 * The syntax of a do-while loop is as follows:
 * 
 * 		do {
 * 			// code-to-repeat-while-condition-is-true
 * 		} while (condition);
 * 			
 * Notice how the syntax differs between a while and do-while loop
 */
public class B_DoWhileLoops {
	public static void main(String[] args) {
		/** 1. Discuss the difference between while and do-while */
		System.out.println(" ::: Start of Application [Do-While loop] :::");
		int count = 100; // even when the value is 100 the do-while loop below still runs
		do {
			System.out.println("The value of Count is: " + count);
			count++;
		} while (count < 5);
		
		System.out.println(" ::: End of Application :::");
	}
}
