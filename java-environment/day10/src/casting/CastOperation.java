package casting;

public class CastOperation {
	public static void main(String[] args) {
		long bigNumber = 100L;
		
		/*
		 * Casting allows you to convert between datatypes.
		 * 
		 * Java will automatically cast smaller datatypes into
		 * larger containers.
		 * 
		 * If you try to store a larger datatype into a smaller
		 * container, then you need to explicitly cast (use the
		 * cast operator).
		 */
		int smallerNumber = (int)bigNumber;
		
		bigNumber = smallerNumber;
	}
}
