package b_flowcontrol.loops;

public class C_LoopsAndBreak {
	public static void main(String[] args) {
		/** 1. Discuss what 'break' statement does in loops */
		/*
		 * Even though we do not change the value of x in
		 * the while loop below, the code will NOT loop 
		 * infinitely, because the break statement halts
		 * the execute of the loop.
		 */
		System.out.println("::: While Loop and 'Break' Statement :::");
		int x = 0;
		while (x < 10) {
			System.out.println("X is: " + x);
			break;
		}
		
		/** 2. Discuss using flow-control statements within a loop and walk through logic. */
		/*
		 * It is more common to use 'break' with a conditional
		 * statement and loops
		 */
		System.out.println("::: While Loop and If-Statement :::");
		while (x < 10) {
			System.out.println("X is: " + x);
			if (x == 5) {
				break;
			}
			x++;
		}
	}
}
