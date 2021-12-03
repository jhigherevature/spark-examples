package datatypes;

public class DatatypeBasics {
	public static void main(String[] args) {
		byte b = 127;
		short s = 10000;
		int i = 100000; // default datatype for whole number literals
		long l = 10000000000000000L; // use an 'L' to indicate a long
		
		float f = 3.14f; // use an 'F' to indicate a float
		double d = 3.14; // default datatype for decimal number literals
		
		boolean bool = true; // true or false
		
		/*
		 * Unlike Javascript which can support
		 * "
		 * '
		 * `
		 * for creating strings.
		 * 
		 * Java uses dobule quotes (") for strings
		 * and single quotes (') for chars
		 */
		char c = 'C';
	}
}
