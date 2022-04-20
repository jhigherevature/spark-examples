package generics;

public class GenericSimulator {
	/*
	 * When using a class or interface that declares a generic
	 * type, you can supply a specific datatype to use with
	 * that object.
	 * 
	 * Below we are creating two instances of the GenericClass
	 * the first uses Strings, and the second uses Integers.
	 * Note that this is another reason why Java provides
	 * Wrapper classes for primitive datatypes!
	 */
	public static void main(String[] args) {
		GenericClass<String> gc_Str = new GenericClass<String>("Revature");
		GenericClass<Integer> gc_Int = new GenericClass<Integer>(100);
	}
}
