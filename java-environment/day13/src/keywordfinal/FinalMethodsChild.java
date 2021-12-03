package keywordfinal;

public class FinalMethodsChild extends FinalMethodsParent {
//	public void nonChangeable() { // error
//		System.out.println("This will not work!");
//	}
	
	public void changeable() {
		System.out.println("Overridden Method!");
	}
}
