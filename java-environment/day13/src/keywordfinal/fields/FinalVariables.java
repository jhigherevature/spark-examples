package keywordfinal.fields;

/*
 * Variables declared with the keyword 'final' cannot
 * be changed, and MUST be initialized either when
 * the variable is declared, or within a constructor
 * for the class (not both).
 */
public class FinalVariables {
	// The variable 'name' is initialized in the constructor below
	public final String name;
	
	// The variable 'number' is initialized when declared
	public final int number = 999;
	
	/*
	 * Note that we only have a value for the variable
	 * name below, since the variable number is given
	 * a value above.
	 */
	public FinalVariables(String name) {
		this.name = name;
	}
	
	public void errorsBelow() {
		System.out.println("You cannot change the value"
				+ " of 'name' or 'number'");
//		this.name = "changed";	// error
//		this.number = 100;		// error
	}
}
