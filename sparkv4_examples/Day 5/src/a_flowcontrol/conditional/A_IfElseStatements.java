package a_flowcontrol.conditional;

/*
 * If-else statements - The most common conditional statement which allows
 * 				a developer to create a 'branching' flow control structure.
 * 		Sometimes if-else statements are referred to as "if-then-otherwise"
 * 		statements. 
 * 
 * The syntax for an if-else statement is as follows:
 *	 if (condition) {
 * 		// code-to-execute-when-condition-is-true
 * 	 } else {
 * 		// code-to-execute-when-condition-is-false
 * 	 }
 * 
 */
public class A_IfElseStatements {
	public static void main(String[] args) {
		/** 1. Explain if-statements */
		System.out.println("::: If statement basics :::");
		int x = 10;
		if (x > 5) {
			System.out.println("The condition was true");
			System.out.println("X is greater than 5");
		}
		
		/** 2. Explain using curly braces with flow-control statements */
		/*
		 * Remember that flow control statements only apply their logic to 
		 * the next line of code if you do not include parentheses!
		 */
		if (x > 100)
			System.out.println("The condition was true");
			System.out.println("X is greater than 100");
			
		/** 3. Explain else statements */
		/* 
		 * Use an 'else' statement when you want to execute alternative logic
		 */
		int y = 9;
		if (y % 2 == 0) {
			System.out.println("A was an even number!");
		} else {
			System.out.println("A was an odd number!");
		}
		
		/** 4. Explain Else-if. Remember to discuss "Mutually Exclusive" nature of if-else-if  */
		System.out.println("::: If-Else-If Statements :::");
		/*
		 * An if-else-if statement block is a common structure to
		 * evaluate multiple conditions in sequence. This is simply
		 * appending multiple if-else statements one after the other
		 * 
		 * if-else-if statement blocks are 'mutually exclusive' meaning
		 * only one of the if-statement blocks will execute
		 */
		int z = 9;
		if (z < 0) {
			System.out.println("Z is a negative number");
		} else if (z >= 5 && z <= 10) {
			System.out.println("Z is between 5 and 10");
		} else if (z == 9) {
			System.out.println("This code won't run..."); // this won't run
		} else if (z >= 100) {
			System.out.println("Z is greater than 100");
		} else {
			System.out.println("Z is some other number");
		}
		
		/** 5. Explain Nesting if-statements */
		System.out.println("::: Nested If-Statements :::");
		char letter = 'a';
		int number = 10;
		/* 
		 * this if-statement checks if the character is an uppercase
		 * letter
		 */
		if (letter >= 'A' && letter <= 'Z') {
			if (number % 2 == 0) {
				System.out.println("Letter is Uppercase. Number is even.");
			} else {
				System.out.println("Letter is Uppercase. Number is odd.");
			}
		} else if (letter >= 'a' && letter <= 'z') {
			if (number % 2 == 0) {
				System.out.println("Letter is Lowercase. Number is even.");
			} else {
				System.out.println("Letter is Lowercase. Number is odd.");
			}
		}
	}
}
