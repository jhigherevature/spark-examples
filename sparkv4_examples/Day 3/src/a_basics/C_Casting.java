package a_basics;

public class C_Casting {
	public static void main(String[] args) {
		/** 1. Explain what casting is: */
		// downcasting example - implicitly done by the Java
		int myInt1 = 100;
		double myDouble1 = myInt1;
		
		// upcasting example - needs an explicit cast using cast operator
		double myDouble2 = 10.0;
		int myInt2 = (int)myDouble2;
	}
}
