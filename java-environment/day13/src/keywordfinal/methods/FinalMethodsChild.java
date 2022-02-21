package keywordfinal.methods;

public class FinalMethodsChild extends FinalMethodsParent {
	/*
	 * Child classes will still inherit final methods, but they
	 * cannot override the inherited functionality
	 */
//	public void nonChangeable() { // error
//		System.out.println("This will not work!");
//	}
	
	public void changeable() {
		System.out.println("Overridden Method!");
	}
}
