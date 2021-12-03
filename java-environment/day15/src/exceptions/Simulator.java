package exceptions;

public class Simulator {
	/*
	 * When a declared method has a 'throws' declaration,
	 * it is used to consolidate how many try/catch blocks
	 * are needed throughout your code. In this case, any
	 * method which has the 'throws' declaration must 
	 * eventually be handled within a try/catch block, as 
	 * shown below:
	 */
	public static void main(String[] args) {
		CustomMathOperations math = new CustomMathOperations();
		try {
			math.sumOddNumbers(2, 1);
			math.sumDifferentNumbers(2, 4);
		} catch (EvenNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println("Ask the user for different input!");
		} catch (DuplicateInputException e) {
			e.printStackTrace();
		}
//		math.sumDifferentOddNumbers(3, 3);
	}
}
