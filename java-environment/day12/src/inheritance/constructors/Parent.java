package inheritance.constructors;

public class Parent extends GrandParent {
	public String first_name;
	
	// No-argument (no-args) constructor for the Parent class
	public Parent() {
		System.out.println("No-args Constructor [Parent Class]");
	}
	
	// Parameterized constructor for the Parent class
	public Parent(String first_name, String last_name) {
//		super(last_name);
		System.out.println("Parameterized Constructor [Parent Class]");
		this.first_name = first_name;
	}
}
