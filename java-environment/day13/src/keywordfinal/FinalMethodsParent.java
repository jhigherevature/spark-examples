package keywordfinal;

public class FinalMethodsParent {
	public final void nonChangeable() {
		System.out.println("This method cannot be overridden");
	}
	
	public void changeable() {
		System.out.println("This method can be overridden");
	}
}
