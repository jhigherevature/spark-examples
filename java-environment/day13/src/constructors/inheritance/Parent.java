package constructors.inheritance;

/*
 * Java will ONLY provide your class with a default 
 * (no-args) constructor if you do not provide a 
 * custom constructor. 
 * 
 * In this example, the Parent class only defined a 
 * constructor which takes two String parameters. As
 * such, it does not have a default constructor.
 */
public class Parent {
	public String first_name;
	public String last_name;
	
	// default / no-args constructor
//	public Parent() { 
//		super();
//	}
	
	/*
	 * Parameterized Constructor - takes two arguments:
	 * 	arg0 - String first_name
	 * 	arg1 - String last_name
	 */
	public Parent(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
	}
}
