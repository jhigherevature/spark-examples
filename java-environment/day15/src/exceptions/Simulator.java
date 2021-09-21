package exceptions;

public class Simulator {
	public static void main(String[] args) {
		try {
			sumOddNumbers(1,2);
		} catch (EvenNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {			
			System.out.println("This will run, even if we do or don't catch an exception!");
		}
	}
	
	public static int sumOddNumbers(int a, int b) 
			throws EvenNumberException {
		if (a % 2 == 0)
			throw new EvenNumberException("First input was even");
		
		if (b % 2 == 0)
			throw new EvenNumberException("Second input was even");

		return a + b;
	}
}
