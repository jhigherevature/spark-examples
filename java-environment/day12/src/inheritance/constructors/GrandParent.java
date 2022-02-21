package inheritance.constructors;

public class GrandParent {
	public String familyName;
	
	public GrandParent() {
		System.out.println("No-args Constructor [Grandparent Class]");
	}
	
	// Parameterized Constructor for the Grandparent class
	public GrandParent(String familyName) {
		System.out.println("Parameterized Constructor [Grandparent Class]");
		this.familyName = familyName;
	}
}
