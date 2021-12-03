package casting;

public class CastingSimulator {
	public static void main(String[] args) {
		/*
		 * The cast operator '(datatype)' is a unary
		 * operator that can be used to return a variable's
		 * value as another datatype.
		 * 
		 * We can ONLY use casting between primitives or
		 * for reference variables that share an inheritance
		 * heirarchy. (More on inheritance later...).
		 * 
		 * As a general rule, you can cast from a "smaller"
		 * datatype to a "larger" datatype automatically
		 * i.e. you do NOT need to use the cast operator.
		 * However, you cannot cast from a larger to a 
		 * smaller automatically, and must use the cast operator.
		 */
		
		int whole = 99;
		double decimal = whole; // converting from int to double		
		whole = (int)decimal; // converting from double to int
		
		/*
		 * When you convert a decimal number to an integer
		 * the decimal values are truncated (removed). Java
		 * will not round!
		 */
		decimal = 9.9999999;
		whole = (int)decimal;
		System.out.println(whole); // 9
		
		char bigA = 'A';
//		System.out.println(bigA);
		char smallA = 'a';
		System.out.println(bigA + " is number: " + (int)bigA);
		System.out.println(smallA + " is number: " + (int)smallA);
	}
}
