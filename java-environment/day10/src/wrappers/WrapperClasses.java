package wrappers;

public class WrapperClasses {
	public static void main(String[] args) {
		/*
		 * primitive datatypes cannot be assigned null values.
		 * primitive variables are stored entirely in stack memory
		 * wrapper class equivalent are stored in heap memory
		 * 
		 * wrapper classes exist within the 'Object' inheritance
		 * heirarchy (this gives us some advantages that we will
		 * examine in more detail later...)
		 * 
		 * Wrapper classes are, as their name suggests, a class
		 * This means we do not have an 'Integer' or 'Double', etc...
		 * keyword. These are class names.
		 * 
		 * Primitive variables are declared with keywords:
		 * int, double, char, etc...
		 */
		// int i create a primitive variable
		int i = 9;
		
		// Integer number creates an object and reference variable
		Integer number = i;
		
		number = null;
		
		i = number;
		
	}
}
