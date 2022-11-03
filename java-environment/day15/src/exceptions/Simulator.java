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
//			int sum = math.sumOddNumbers(5, 2);
			int sum = math.sumDifferentOddNumbers(2,5);
			System.out.println(sum);
		} catch (EvenNumberException e) {
			e.printStackTrace();
		} catch (DuplicateInputException e) {
			e.printStackTrace();
			System.out.println("You passed two of the same number, try not to do that!");
		}
	}
}
