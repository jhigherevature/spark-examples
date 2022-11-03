package a_flowcontrol.conditional;

/*
 * Switch statements are another flow-control statement which creates
 * branching structures. However, switch statements compare an expression
 * to specified case statement values. 
 * 
 * The syntax of a switch statement is as follows:
 * 
 * 		switch (expression) {
 * 			case value1 :
 * 				// code-to-execute-if-expression-matches-value1
 * 				break;
 * 			case value2 : 
 * 				// code-to-execute-if-expression-matches-value2
 * 				break;
 * 			etc...
 * 			default :
 * 				// code-to-execute-if-no-other-case-matches
 * 		}
 * 
 * The values of a case statement must match the datatype of the expression 
 * which is evaluated. Meaning you cannot have a case value that is a boolean
 * if the variable evaluated is an int, for example.
 * 
 * Switch statements use the keyword 'default' to declare logic that should
 * execute if no other case matches the evaluated expression's value. This
 * is similar to the 'else' statement in an if-else statement.
 * 
 * Note that the 'default' case can be placed before or after any of the other 
 * case statements, but typically it is placed at the end of the block.
 */
public class B_SwitchStatements {
	public static void main(String[] args) {
		/** 1. Explain switch-statements and differences to if-else statements. Mention that default can be placed anywhere */
		System.out.println("::: Switch using 'Break' Keyword");
		char c = 'B';
		switch (c) {
			case 'A': 
				System.out.println("A for Assembly");
				break;
			case 'B' : 
				System.out.println("B for Binary");
				break;
			case 'C' : 
				System.out.println("C for Compile");
				break;
			default : 
				System.out.println("There are too many letters");
				break; // this 'break' is not required...
		}
		
		/** 2. Explain break statement with switch. */
		/*
		 * Switch statements are NOT mutually exclusive. Instead, switch
		 * statements use 'fall-through' logic. 'Fall-through' logic
		 * means that your switch statement will execute the code of a
		 * case statement and ALL following code, until either the keyword
		 * 'break' is reached or the end of the switch statement.
		 */
		System.out.println("::: Switch without 'Break' Keyword");
		switch (c) {
			case 'A': 
				System.out.println("A for Assembly");
			case 'B' : 
				System.out.println("B for Binary");
			case 'C' : 
				System.out.println("C for Compile");
			default : 
				System.out.println("There are too many letters");
		}
	}
}
