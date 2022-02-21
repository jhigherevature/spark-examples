package datatypes;

public class DatatypeBasics {
	/*
	 * In Java, variables are either primitive variables 
	 * or reference variables.
	 * 
	 * primitive variable types include:
	 * byte, short, int, long, float, double, boolean, char
	 * 
	 * Any other type is a reference variable!
	 */
	byte by = 127; // whole number up to 8 bits.
	byte[] byArr;
	short s = 32767; // whole number up to 16 bits.
	
	/*
	 * When writing numbers in Java, underscores can be used. They
	 * are commonly used every 3 digits, similar to a comma. Note, you
	 * do not have to follow this convention, but it makes your code
	 * easier to read. 
	 */
	int i = 2_147_483_647; // whole number up to 32 bits.
//	int decimal = 3.14F;
	/*
	 * Whole number literals are treated as most, as an int. If you
	 * want to treat a number as a long, you need to apply the letter
	 * 'L' after the number
	 */
	long l = 500_000_000_000L; // whole number up to 64 bits.
	
	/*
	 * Double's are the default datatype for floating point numbers 
	 * (i.e. decimal numbers)
	 */
	float f = 3.14F;
	double d = 3.14;
	
	boolean b = true; // true or false
	
	/*
	 * Unlike Javascript (which uses:
	 * 		single quote ( ' )
	 * 		double quotes ( " )
	 * 		back tick ( ` )
	 * 
	 * Java uses double quotes for strings and single quotes for chars 
	 */
	char c = 'A';

	/*
	 * When you want to perform work in a Java application, it must
	 * be done within a method. "Perform work" in this case means:
	 * "execute some statements"
	 */
//	for (char character = 'A'; character < 'Z'; character++) {
//		System.out.println(character);
//	}
	public static void main(String[] args) {
		System.out.println("START OF APPLICATION");
		for (char character = 'A'; character < 'Z'; character++) {
			System.out.println(character);
		}
		System.out.println("END OF APPLICATION");
	}
}
