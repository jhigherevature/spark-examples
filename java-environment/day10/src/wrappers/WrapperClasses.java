package wrappers;

/*
 * A 'Wrapper Class' is a term used to describe a class
 * which is used to represent one type of data as another
 * type of data. This is somewhat similar to casting,
 * however, casting implies that we lose some functionality 
 * or change the understanding of the original datatype,
 * whereas a Wrapper provides additional information
 * 
 * Java has built-in wrapper classes for Primitive datatypes
 * so that we can try them like they are objects.
 */
public class WrapperClasses {
	public static void main(String[] args) {
		/*
		 * When we convert from a primitive to a wrapper
		 * this is called "Autoboxing", because java
		 * "automatically boxes the primitive into a larger
		 * container"
		 */
		int num = 99;
		Integer number = num; // treat an 'int' as an object
		
		/*
		 * When we convert from a wrapper to a primitive
		 * this is called "unboxing" (sometimes called
		 * "auto-unboxing") because we take the object
		 * out of the "larger container".
		 */
		num = number; // treat the object as an 'int' 
		
		/*
		 * The primary reason we use primitive Wrapper 
		 * classes is to allow for more flexibility, 
		 * specifically:
		 */
		number = null; // We can assign null to reference variables
		// num = null; // error - primitives cannot be null
		
	}
}
