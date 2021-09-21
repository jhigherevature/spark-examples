package finalvar;

public class FinalKeyword {
	public final String name;
	
	public FinalKeyword(String name) {
		this.name = name;
	}
	public FinalKeyword() {
		this("Default");
	}
	
	public final void nonChangeable() {
		System.out.println("This method cannot be overridden");
	}
	
	public void changeable() {
		System.out.println("This method CAN be overridden");
	}
}
